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

    val drawMenu = arrayOf("成员", "专辑", "单曲", "DVDs", "关于")
    val drawerLayout: DrawerLayout by bindView(R.id.drawer_layout)
    val drawerList: ListView by bindView(R.id.left_drawer)
    val drawerLeft: LinearLayout by bindView(R.id.drawer_left)
    val toolbar: Toolbar by bindView(R.id.gc_toolbar)
    lateinit var spinner: Spinner
    var spinnerMenu: MenuItem? = null
    var indexOfMenu = 0

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
        drawerList.setItemChecked(0, true)
        replaceFragment(MemberFragment.newInstance(), 1)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        spinnerMenu = menu?.findItem(R.id.mmenu_spinner)
        spinner = MenuItemCompat.getActionView(spinnerMenu) as Spinner
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            android.R.id.home -> homeClick()
        }

        return super.onOptionsItemSelected(item)
    }

    private fun homeClick() {
        if (drawerLayout.isDrawerOpen(drawerLeft)) {
            drawerLayout.closeDrawer(drawerLeft)
        } else {
            drawerLayout.openDrawer(drawerLeft)
        }
    }

    fun selectMenu(position: Int) {
        if (position != indexOfMenu) {
            drawerList.setItemChecked(position, true)
            title = drawMenu[position]
            spinnerMenu?.isVisible = false

            when (title) {
                "专辑" -> {
                    spinnerMenu?.isVisible = true
                    spinner.adapter = ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, repository.albumTimes)
                    spinner.onItemSelectedListener = YearSelectedListener() // set the listener,
                    replaceFragment(AlbumFragment.newInstance(0), 0)
                }
                "单曲" -> {
                    spinnerMenu?.isVisible = true
                    spinner.adapter = ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, repository.singleNames)
                    spinner.onItemSelectedListener = SingleSelectedListener() // set the listener,
                    replaceFragment(SingleFragment.newInstance(0), 0)
                }
                "DVDs" -> replaceFragment(DvdFragment.newInstance(), 0)
                "关于" -> replaceFragment(AboutFragment.newInstance(), 1)
                "成员" -> replaceFragment(MemberFragment.newInstance(), 1)
            }
        }

        drawerLayout.closeDrawer(drawerLeft)
        indexOfMenu = position
    }

    private fun replaceFragment(fragment: Fragment, type: Int) {
        if (type == 1) {
//            val slideTransition = Slide(Gravity.LEFT)
//            slideTransition.duration = resources.getInteger(R.integer.anim_duration_long).toLong()
//            fragment.reenterTransition = slideTransition
//            fragment.exitTransition = slideTransition
//            fragment.sharedElementEnterTransition = ChangeBounds()
        }
        supportFragmentManager.beginTransaction().replace(R.id.content, fragment).commit()
    }

    private fun updateYear(position: Int) {
        if (title == "专辑") {
            replaceFragment(AlbumFragment.newInstance(position), 0)
        }
    }

    private fun updateSingle(position: Int) {
        if (title == "单曲") {
            replaceFragment(SingleFragment.newInstance(position), 0)
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




