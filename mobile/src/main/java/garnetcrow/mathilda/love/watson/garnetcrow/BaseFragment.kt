package garnetcrow.mathilda.love.watson.garnetcrow

import android.support.v4.app.Fragment

/**
 * Created by watson on 16/10/24.
 */
abstract class BaseFragment : Fragment() {

    var toolbarColor: Int? = null

    override fun onResume() {
        super.onResume()
        if (toolbarColor == null) toolbarColor = resources.getColor(R.color.colorPrimary)
    }

    override fun onPause() {
        super.onPause()
    }

}