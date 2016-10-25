package garnetcrow.mathilda.love.watson.garnetcrow

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by watson on 16/10/24.
 */
class PersonFragment : BaseFragment() {

    companion object {
        val KEY_YEAR_POSITION = "position"

        fun newInstance(position: Int): Fragment {
            val fragment = PersonFragment()
            val args = Bundle()
            args.putInt(KEY_YEAR_POSITION, position)
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater?.inflate(R.layout.personfragment, container, false)
//        val image1 = view?.findViewById(R.id.image1) as ImageView
//        WLog.log().i("get i ${arguments.getInt(KEY_YEAR_POSITION)}")
//        ViewCompat.setTransitionName(image1, "image" + arguments.getInt(KEY_YEAR_POSITION))
        return view
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }


}