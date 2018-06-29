package login.mnqobi.com.mx.login

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_layouts.*
import login.mnqobi.com.mx.login.adapters.AdapterLayout
import login.mnqobi.com.mx.login.models.ModelLayout

class LayoutsActivity : AppCompatActivity() {

    private val adapter: AdapterLayout by lazy { AdapterLayout(this) }
    private var listLayout: ArrayList<ModelLayout> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layouts)
        this.recycler_view_layouts.adapter=adapter
        var i=1
        val layouts: Array<out String>? =resources.getStringArray(R.array.layouts)
        val layoutsDescription: Array<out String>? =resources.getStringArray(R.array.description_layouts)
        val layoutsImage: Array<out String>? =resources.getStringArray(R.array.image_layouts)
        for(i in 0..4) {
            listLayout.add(ModelLayout(layouts?.get(i)!!, layoutsDescription?.get(i)!!, layoutsImage?.get(i)!!))
        }
        adapter.updateList(listLayout)
    }
}

