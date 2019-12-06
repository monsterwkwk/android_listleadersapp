package co.id.iconpln.listleadersapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.activity_leader_detail.*

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
        displayLeaderDetail()
    }

    // object
    private fun initIntentExtras() {
        leader = intent.getParcelableExtra(EXTRA_HERO)
    }

    private fun displayLeaderDetail(){
        // using object
        tvDetailTitle.text = leader.name
        tvDetailDescription.text = leader.desc
        tvDetailCountry.text = leader.country
        Glide.with(this)
            .load(leader.photo)
            .apply(
                RequestOptions()
                    .centerCrop()
                    .placeholder(R.drawable.ic_launcher_foreground)
                    .error(R.drawable.ic_launcher_foreground)
            )
            .into(ivDetailImage)

    }
}
