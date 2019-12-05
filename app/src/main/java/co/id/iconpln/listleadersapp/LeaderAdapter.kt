package co.id.iconpln.listleadersapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide

class LeaderAdapter(val context: Context, val listWorldLeaders: ArrayList<ModelLeader>): BaseAdapter() {
    override fun getView(index: Int, view: View?, viewGroup: ViewGroup?): View {
        val viewLayout = LayoutInflater.from(context)
            .inflate(R.layout.item_list, viewGroup, false)

        val viewHolder = ViewHolder(viewLayout)
        val leaders = getItem(index) as ModelLeader
        viewHolder.bind(context, leaders)

        return viewLayout
    }

    override fun getItem(index: Int): Any {
        return listWorldLeaders[index]
    }

    override fun getItemId(index: Int): Long {
        return index.toLong()
    }

    override fun getCount(): Int {
        return listWorldLeaders.size
    }

    private inner class ViewHolder(view: View) {
        private val tvLeadersName: TextView = view.findViewById(R.id.tvListTitle)
        private val tvLeadersDesciption: TextView = view.findViewById(R.id.tvListDescription)
        private val tvLeaderCountry: TextView = view.findViewById(R.id.tvListCountry)
        private val ivLeadersPhoto: ImageView = view.findViewById(R.id.ivListImage)

        fun bind(context: Context, leaders: ModelLeader) {
            tvLeadersName.text = leaders.name
            tvLeadersDesciption.text = leaders.desc
            tvLeaderCountry.text = leaders.country
            Glide.with(context)
                .load(leaders.photo)
                .into(ivLeadersPhoto)
        }
    }
}