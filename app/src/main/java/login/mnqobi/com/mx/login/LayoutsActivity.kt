package login.mnqobi.com.mx.login

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_layouts.*

class LayoutsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layouts)
        onClick()
    }

    fun onClick(){
        this.button_acept.setOnClickListener {
            startActivity(Intent(this,DetailsLayoutActivity::class.java))
        }
    }
}

