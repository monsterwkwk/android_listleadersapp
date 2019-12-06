package co.id.iconpln.listleadersapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class LeaderDetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_DESC = "extra_desc"
        const val EXTRA_COUNTRY = "extra_country"
        const val EXTRA_IMAGE_URL = "extra_image_url"

        const val EXTRA_HERO = "extra_hero"
    }

    private lateinit var leader: ModelLeader

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_leader_detail)

        initIntentExtras()
    }

    // object
    private fun initIntentExtras() {
        leader = intent.getParcelableExtra(EXTRA_HERO)
    }
}
