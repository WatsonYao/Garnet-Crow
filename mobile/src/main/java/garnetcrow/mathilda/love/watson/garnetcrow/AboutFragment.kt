package garnetcrow.mathilda.love.watson.garnetcrow

import android.net.Uri
import android.os.Bundle
import android.support.customtabs.CustomTabsIntent
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import garnetcrow.mathilda.love.watson.garnetcrow.helpers.bindView

/**
 * Created by watson on 16/10/24.
 */
class AboutFragment : BaseFragment() {

    companion object {
        fun newInstance(): Fragment {
            return AboutFragment()
        }
    }

    val github: TextView by bindView(R.id.github)


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.about_fragment, container, false);
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        github.setOnClickListener { view -> openCustomTab("https://github.com/WatsonYao/GarnetCrow") }
    }

    private fun openCustomTab(url: String) {
        CustomTabsIntent.Builder().setToolbarColor(toolbarColor ?: 0).build().launchUrl(activity, Uri.parse(url))
    }


}