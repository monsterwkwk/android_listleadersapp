package co.id.iconpln.listleadersapp

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_BUNDLE_EMAIL = "extra_bundle_email"
        const val EXTRA_BUNDLE_PASSWORD = "extra_bundle_password"
    }

    private val list: ArrayList<ModelLeader> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadListBaseAdapter(this)
        setListItemClickListener()
    }

    private fun setListItemClickListener(listView: ListView) {
        listView.onItemClickListener = object : AdapterView.OnItemClickListener{
            override fun onItemClick(adapterView: AdapterView<*>?, view: View?, index: Int, l: Long) {

            }
        }
    }

    fun loadListBaseAdapter(context: Context) {
        list.addAll(DataLeader.listDataWorldLeaders)

        val baseAdapter = LeaderAdapter(context, list)
        lvLeaders.adapter = baseAdapter
    }
}
