package co.id.iconpln.listleadersapp

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
    }

    fun loadListBaseAdapter(context: Context) {
        list.addAll(DataLeader.listDataWorldLeaders)

        val baseAdapter = LeaderAdapter(context, list)
        lvLeaders.adapter = baseAdapter
    }
}
