package garnetcrow.mathilda.love.watson.garnetcrow

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.view.MenuItemCompat
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.*
import demo.kotlin.mathilda.love.watson.watsondemo.WLog
import garnetcrow.mathilda.love.watson.garnetcrow.helpers.bindView
import garnetcrow.mathilda.love.watson.garnetcrow.model.BusHelper
import garnetcrow.mathilda.love.watson.garnetcrow.model.repository

class MainActivity : AppCompatActivity() {

    val drawMenu = arrayOf("专辑", "单曲", "DVDs", "成员", "关于")
    val drawerLayout: DrawerLayout by bindView(R.id.drawer_layout)
    val drawerList: ListView by bindView(R.id.left_drawer)
    val drawerLeft: LinearLayout by bindView(R.id.drawer_left)
    val toolbar: Toolbar by bindView(R.id.gc_toolbar)
    lateinit var spinner: Spinner

    override fun onPause() {
        super.onPause()
        BusHelper.bus.unregister(this)
    }

    override fun onResume() {
        super.onResume()
        BusHelper.bus.register(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mDrawerToggle = object : ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.app_name, R.string.app_name) {
            override fun onDrawerOpened(drawerView: View?) {
                WLog.log().i("onDrawerOpened")
            }

            override fun onDrawerClosed(drawerView: View?) {
                WLog.log().i("onDrawerClosed")
            }
        }
        drawerLayout.addDrawerListener(mDrawerToggle)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayShowHomeEnabled(true)
        supportActionBar?.setHomeButtonEnabled(true)
        mDrawerToggle.syncState()
        title = drawMenu[0]

        drawerList.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_activated_1, drawMenu)
        drawerList.onItemClickListener = DrawerItemClickListener()

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        val item = menu?.findItem(R.id.mmenu_spinner)
        spinner = MenuItemCompat.getActionView(item) as Spinner
        spinner.adapter = ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, repository.albumTimes)
        spinner.onItemSelectedListener = YearSelectedListener() // set the listener,
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            android.R.id.home -> homeClick()
        }

        return super.onOptionsItemSelected(item)
    }

    private fun homeClick() {
        WLog.log().i("homeClick")
        if (drawerLayout.isDrawerOpen(drawerLeft)) {
            drawerLayout.closeDrawer(drawerLeft)
        } else {
            drawerLayout.openDrawer(drawerLeft)
        }
    }

    fun selectMenu(position: Int) {
        drawerList.setItemChecked(position, true)
        title = drawMenu[position]
        drawerLayout.closeDrawer(drawerLeft)
        spinner.visibility = View.GONE

        when (title) {
            "专辑" -> {
                spinner.visibility = View.VISIBLE
                spinner.adapter = ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, repository.albumTimes)
                spinner.onItemSelectedListener = YearSelectedListener() // set the listener,
                replaceFragment(AlbumFragment.newInstance(0))
            }
            "单曲" -> {
                spinner.visibility = View.VISIBLE
                spinner.adapter = ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, repository.singleNames)
                spinner.onItemSelectedListener = SingleSelectedListener() // set the listener,
                replaceFragment(SingleFragment.newInstance(0))
            }
            "DVDs" -> replaceFragment(DvdFragment.newInstance())
            "关于" -> replaceFragment(AboutFragment.newInstance())
            "成员" -> replaceFragment(MemberFragment.newInstance())
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.content, fragment).commit()
    }

    private fun updateYear(position: Int) {
        if (title == "专辑") {
            replaceFragment(AlbumFragment.newInstance(position))
        }
    }

    private fun updateSingle(position: Int) {
        if (title == "单曲") {
            replaceFragment(SingleFragment.newInstance(position))
        }
    }

    inner class YearSelectedListener : AdapterView.OnItemSelectedListener {
        override fun onNothingSelected(p0: AdapterView<*>?) {
        }

        override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
            WLog.log().i("p2:$p2 p3:$p3")
            updateYear(p2)
        }
    }

    inner class SingleSelectedListener : AdapterView.OnItemSelectedListener {
        override fun onNothingSelected(p0: AdapterView<*>?) {
        }

        override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
            WLog.log().i("p2:$p2 p3:$p3")
            updateSingle(p2)
        }
    }

    inner class DrawerItemClickListener : AdapterView.OnItemClickListener {
        override fun onItemClick(parent: AdapterView<*>, view: View, position: Int, id: Long) {
            selectMenu(position)
        }
    }
}




