package garnetcrow.mathilda.love.watson.garnetcrow

import android.graphics.drawable.BitmapDrawable
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.graphics.Palette
import android.transition.ChangeBounds
import android.transition.Fade
import android.transition.Slide
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import demo.kotlin.mathilda.love.watson.watsondemo.WLog
import java.util.*

/**
 * Created by watson on 16/10/24.
 */
class MemberFragment : BaseFragment() {

    val images: ArrayList<ImageView> = ArrayList<ImageView>()
    //    by bindViews(R.id.image1, R.id.image2, R.id.image3, R.id.image4)
    val names: ArrayList<TextView> = ArrayList<TextView>()
    //    by bindViews(R.id.name1, R.id.name2, R.id.name3, R.id.name4)
    val clicks: ArrayList<View> = ArrayList<View>()
//by bindViews(R.id.sof1, R.id.sof2, R.id.sof3, R.id.sof4)

    companion object {
        fun newInstance(): Fragment {
            return MemberFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.member_f, container, false);
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews(view)
        updateUi()
    }

    private fun initViews(view: View?) {
        images.clear()
        names.clear()
        clicks.clear()
        if (view != null) {
            images.add(view.findViewById(R.id.image1) as ImageView)
            images.add(view.findViewById(R.id.image2) as ImageView)
            images.add(view.findViewById(R.id.image3) as ImageView)
            images.add(view.findViewById(R.id.image4) as ImageView)

            names.add(view.findViewById(R.id.name1) as TextView)
            names.add(view.findViewById(R.id.name2) as TextView)
            names.add(view.findViewById(R.id.name3) as TextView)
            names.add(view.findViewById(R.id.name4) as TextView)

            clicks.add(view.findViewById(R.id.sof1) as View)
            clicks.add(view.findViewById(R.id.sof2) as View)
            clicks.add(view.findViewById(R.id.sof3) as View)
            clicks.add(view.findViewById(R.id.sof4) as View)
        }
    }

    private fun updateUi() {
        WLog.log().i("updateUi")
        for (i in images.indices) {
            val palette = Palette.from((images[i].drawable as BitmapDrawable).getBitmap()).generate()
            val swatch = palette.vibrantSwatch
            if (swatch != null) {
                names[i].setBackgroundColor(swatch.rgb)
                names[i].alpha = 0.8f
                names[i].setTextColor(swatch.titleTextColor)
            }
        }

        for (i in clicks.indices) {
            clicks[i].setOnClickListener {
                addPersonFragment(i)
            }
        }
    }

    private fun addPersonFragment(i: Int) {
        WLog.log().i("i $i")
        val personFragment = PersonFragment.newInstance(i)

        val slideTransition = Slide(Gravity.RIGHT)
        slideTransition.duration = resources.getInteger(R.integer.anim_duration_medium).toLong()

        val changeBoundsTransition = ChangeBounds()
        changeBoundsTransition.duration = resources.getInteger(R.integer.anim_duration_medium).toLong()

        personFragment.enterTransition = Fade()
        personFragment.allowEnterTransitionOverlap = false
        personFragment.allowReturnTransitionOverlap = false
        personFragment.sharedElementEnterTransition = changeBoundsTransition
        fragmentManager.beginTransaction()
//                .addSharedElement(images[i], "image")
                .replace(R.id.content, personFragment)
                .addToBackStack(null)
                .commit()
    }

}