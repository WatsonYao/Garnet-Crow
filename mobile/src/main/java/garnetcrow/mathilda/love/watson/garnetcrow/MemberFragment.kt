package garnetcrow.mathilda.love.watson.garnetcrow

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by watson on 16/10/24.
 */
class MemberFragment : BaseFragment() {

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

    }


}