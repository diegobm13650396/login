package login.mnqobi.com.mx.login

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class SplashActivity:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if(true){
            val intent=Intent(this,LoginActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}