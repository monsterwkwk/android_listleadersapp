package co.id.iconpln.listleadersapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_BUNDLE_EMAIL = "extra_bundle_email"
        const val EXTRA_BUNDLE_PASSWORD = "extra_bundle_password"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
