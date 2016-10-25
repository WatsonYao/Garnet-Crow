package garnetcrow.mathilda.love.watson.garnetcrow

import android.app.Activity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import garnetcrow.mathilda.love.watson.garnetcrow.helpers.bindView
import garnetcrow.mathilda.love.watson.garnetcrow.model.Album
import garnetcrow.mathilda.love.watson.garnetcrow.model.repository

/**
 * Created by watson on 16/10/24.
 */
class DvdFragment : BaseFragment() {

    companion object {
        fun newInstance(): Fragment {
            return DvdFragment()
        }
    }

    val recycler: RecyclerView by bindView(R.id.recycler)

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.basefragment, container, false);
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recycler.layoutManager = LinearLayoutManager(activity)
        recycler.adapter = AlbumAdater(activity)
    }

    inner class AlbumAdater(val activity: Activity) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {


        override fun getItemCount(): Int = repository.dvdsList.size

        override fun onBindViewHolder(holder: RecyclerView.ViewHolder?, position: Int) {
            val hold = holder as AlbumViewHolder
            val item = getItemValue(position)
            hold.let {
                hold.name.text = item.name
            }
        }

        override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): RecyclerView.ViewHolder {
            return AlbumViewHolder(LayoutInflater.from(activity).inflate(R.layout.single_list_item, parent, false));
        }

        fun getItemValue(position: Int): Album = repository.dvdsList[position]

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