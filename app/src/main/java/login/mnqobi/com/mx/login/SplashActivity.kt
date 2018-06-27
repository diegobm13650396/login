package login.mnqobi.com.mx.login

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import mx.com.ia.comunicacioninterna.SharedPreferencesManager

class SplashActivity:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val user=SharedPreferencesManager.getToken(this)
        if(user.isEmpty()){
            val intent=Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }else{
            val intent=Intent(this,LayoutsActivity::class.java)
            startActivity(intent)
        }
        finish()
    }
}