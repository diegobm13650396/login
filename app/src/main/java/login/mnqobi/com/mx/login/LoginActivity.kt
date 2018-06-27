package login.mnqobi.com.mx.login

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import kotlinx.android.synthetic.main.activity_login.*
import mx.com.ia.comunicacioninterna.SharedPreferencesManager

class LoginActivity : AppCompatActivity() {


    private var user=""
    private var pass=""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        email_sign_in_button.setOnClickListener { attemptLogin() }
    }


    private fun attemptLogin() {
        if (validateEmail()) {
            SharedPreferencesManager.saveToken(this, this.email.text.toString(), this.password.text.toString())
            startActivity(Intent(this, LayoutsActivity::class.java))
        } else {

        }
    }

    private fun validateEmail(): Boolean {
        var itsValid = true
        this.user = this.email?.text?.toString()?.trim() ?: ""
        this.pass = this.password?.text?.toString()?.trim() ?: ""
        val passSize = this.password.length()
        when {
            user.isBlank() -> {
                this.email.error = getString(R.string.user_name_error)
                itsValid = false
            }
            pass.isBlank() -> {
                this.password.error = getString(R.string.password_error)
                itsValid = false
            }

            passSize < 5 -> {
                this.password.error = getString(R.string.password_error)
                itsValid = false
            }
        }

        return itsValid
    }


}
