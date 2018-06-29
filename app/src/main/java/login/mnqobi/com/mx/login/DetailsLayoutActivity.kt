package login.mnqobi.com.mx.login

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_details_layout.*
import kotlinx.android.synthetic.main.content_details_layout.*
import login.mnqobi.com.mx.login.models.ModelLayout
import login.mnqobi.com.mx.login.utils.Constants
import login.mnqobi.com.mx.login.utils.Constants.KEY_LAYOUT

class DetailsLayoutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details_layout)
        val string: String = intent.extras[KEY_LAYOUT] as String
        val gson=Gson()
        val layout: ModelLayout? =gson.fromJson(string,ModelLayout::class.java)
        toolbar.title=layout?.nameLayout
        setSupportActionBar(toolbar)
        this.text_view_description_layout.text=layout?.descriptionLayout


    }
}
