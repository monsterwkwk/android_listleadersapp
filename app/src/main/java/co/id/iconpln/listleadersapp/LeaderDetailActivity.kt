package co.id.iconpln.listleadersapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
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
        share()
        setupActionbar()
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

    private fun share(){
        ivDetailImg.setOnClickListener {
            val str = "${leader.name}: ${leader.desc}"
            val intent = Intent(Intent.ACTION_SEND)
            intent.putExtra(Intent.EXTRA_TEXT, str)
            intent.type = "text/plain"
            startActivity(intent)
        }
    }

    private fun setupActionbar(){
        supportActionBar?.title = leader.name
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId) {
            android.R.id.home -> {
                finish()
                true
            }
            else -> {
                false
            }
        }
    }
}
