package co.id.iconpln.listleadersapp

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    private val email: String = "user@mail.com"
    private val password: String = "password"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnLogin.setOnClickListener {
            var check: Boolean = checkLogin(email, password)

            if(check) {
                val intent = Intent(this, MainActivity::class.java)
                val bundle = Bundle()
                bundle.putString(MainActivity.EXTRA_BUNDLE_EMAIL, email)
                bundle.putString(MainActivity.EXTRA_BUNDLE_PASSWORD, password)
                intent.putExtras(bundle)
                startActivity(intent)
                finish()
            }
        }
    }

    // add extention function to Activity
    private fun Activity.checkLogin(email: String, password: String): Boolean {
        var isSuccess: Boolean = false

        if (etEmail.text.isNullOrEmpty() && etPassword.text.isNullOrEmpty()){
            etEmail.error = "Please insert email"
            etPassword.error = "Please insert password"
            isSuccess = false
        } else if(etEmail.text.isNullOrEmpty()) {
            etEmail.error = "Please insert email"
            isSuccess = false
        } else if(etPassword.text.isNullOrEmpty()) {
            etPassword.error = "Please insert password"
            isSuccess = false
        } else if(!android.util.Patterns.EMAIL_ADDRESS.matcher(etEmail.text).matches()) {
            etEmail.error = "Invalid e-mail format"
            isSuccess = false
        } else if(etPassword.text.length < 7) {
            etPassword.error = "Password length must greater or same than 7"
            isSuccess = false
        } else if(etEmail.text.toString() != email || etPassword.text.toString() != password) {
            tvMsg.setText("Email or password invalid.")
            isSuccess = false
        } else {
            isSuccess = true
        }

        return isSuccess
    }
}
