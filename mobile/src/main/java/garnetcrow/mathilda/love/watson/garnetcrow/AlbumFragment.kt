package garnetcrow.mathilda.love.watson.garnetcrow

import android.app.Activity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import garnetcrow.mathilda.love.watson.garnetcrow.helpers.bindView
import garnetcrow.mathilda.love.watson.garnetcrow.model.Song
import garnetcrow.mathilda.love.watson.garnetcrow.model.repository

/**
 * Created by watson on 16/10/24.
 */
class AlbumFragment : BaseFragment() {

    companion object {
        val KEY_YEAR_POSITION = "year"

        fun newInstance(position: Int): Fragment {
            val fragment = AlbumFragment()
            val args = Bundle()
            args.putInt(KEY_YEAR_POSITION, position)
            fragment.arguments = args
            return fragment
        }
    }

    val recycler: RecyclerView by bindView(R.id.recycler)

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.basefragment, container, false);
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recycler.layoutManager = GridLayoutManager(activity, 2)
        recycler.adapter = AlbumAdater(activity, arguments.getInt(KEY_YEAR_POSITION))
    }

    inner class AlbumAdater(val activity: Activity, val positionOut: Int) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {


        override fun getItemCount(): Int = repository.songsList[positionOut].size

        override fun onBindViewHolder(holder: RecyclerView.ViewHolder?, position: Int) {
            val hold = holder as AlbumViewHolder
            val item = getItemValue(position)
            hold.let {
                hold.name.text = item.name
            }
        }

        override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): RecyclerView.ViewHolder {
            return AlbumViewHolder(LayoutInflater.from(activity).inflate(R.layout.album_list_item, parent, false));
        }

        fun getItemValue(position: Int): Song = repository.songsList[positionOut][position]

    }

    inner class AlbumViewHolder internal constructor(view: View) : RecyclerView.ViewHolder(view) {

        val name: TextView
        val image: ImageView

        init {
            name = view.findViewById(R.id.name) as TextView
            image = view.findViewById(R.id.image) as ImageView
        }
    }


}