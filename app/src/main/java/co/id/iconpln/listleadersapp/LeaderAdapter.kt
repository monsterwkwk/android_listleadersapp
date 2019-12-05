package co.id.iconpln.listleadersapp

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter

class LeaderAdapter(val context: Context, val listWorldLeaders: ArrayList<DataLeader>): BaseAdapter() {
    override fun getView(index: Int, view: View?, viewGroup: ViewGroup?): View {

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

}