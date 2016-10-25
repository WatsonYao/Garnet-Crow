package garnetcrow.mathilda.love.watson.garnetcrow

import android.graphics.drawable.BitmapDrawable
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.graphics.Palette
import android.transition.*
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import garnetcrow.mathilda.love.watson.garnetcrow.helpers.bindView
import garnetcrow.mathilda.love.watson.garnetcrow.helpers.bindViews
import java.util.*

/**
 * Created by watson on 16/10/24.
 */
class MemberFragment_backup : BaseFragment() {

    val images: List<ImageView> by bindViews(R.id.image1, R.id.image2, R.id.image3, R.id.image4)
    val names: List<TextView> by bindViews(R.id.name1, R.id.name2, R.id.name3, R.id.name4)
    val clicks: List<View> by bindViews(R.id.sof1, R.id.sof2, R.id.sof3, R.id.sof4)
    val sceneLayout: ViewGroup by bindView(R.id.sceneLayout)

    var scene1: Scene? = null
    var scene0: Scene? = null

    private val DELAY = 1000

    companion object {
        fun newInstance(): Fragment {
            return MemberFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.member_fragment, container, false);
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        scene0 = Scene.getSceneForLayout(sceneLayout, R.layout.member_fragment_scene0, activity)
        scene1 = Scene.getSceneForLayout(sceneLayout, R.layout.member_fragment_scene1, activity)
        scene1?.setEnterAction {
            updateUi()
        }

        TransitionManager.go(scene0, ChangeBounds())

        Timer().schedule(object : TimerTask() {
            override fun run() {
                if (activity != null) {
                    activity.runOnUiThread {
                        if (activity != null) {
                            TransitionManager.go(scene1, TransitionInflater.from(activity)
                                    .inflateTransition(R.transition.slide_and_changebounds_sequential))
                        }
                    }
                    this.cancel()
                }
            }
        }, 800)
    }

    private fun updateUi() {
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
        val fragment = PersonFragment.newInstance(i)

        val slideTransition = Slide(Gravity.RIGHT)
        slideTransition.duration = resources.getInteger(R.integer.anim_duration_medium).toLong()

        val changeBoundsTransition = ChangeBounds()
        changeBoundsTransition.duration = resources.getInteger(R.integer.anim_duration_medium).toLong()

        fragment.enterTransition = slideTransition
        fragment.allowEnterTransitionOverlap = false
        fragment.allowReturnTransitionOverlap = false
        fragment.sharedElementEnterTransition = changeBoundsTransition

        fragmentManager.beginTransaction()
                .replace(R.id.content, fragment)
                .addToBackStack(null)
//                .addSharedElement(activity.findViewById(R.id.image1) as ImageView, getString(R.string.transphoto))
                .commit()
    }
}