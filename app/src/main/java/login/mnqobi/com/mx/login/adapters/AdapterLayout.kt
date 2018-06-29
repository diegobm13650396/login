package login.mnqobi.com.mx.login.adapters

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.google.gson.Gson
import login.mnqobi.com.mx.login.DetailsLayoutActivity
import login.mnqobi.com.mx.login.R
import login.mnqobi.com.mx.login.extencions.loadImage
import login.mnqobi.com.mx.login.models.ModelLayout
import login.mnqobi.com.mx.login.utils.Constants.KEY_LAYOUT

class AdapterLayout(context: Context): RecyclerView.Adapter<AdapterLayout.ViewHolder>() {

    private val listLayout= mutableListOf<ModelLayout>()
    private var layoutInflater : LayoutInflater?=null
    private val context=context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        if(this.layoutInflater==null){
            layoutInflater = LayoutInflater.from(parent.context)
        }
        val view = this.layoutInflater!!.inflate(R.layout.item_layout,parent,false)
        return ViewHolder(view)
    }

    fun updateList(list:List<ModelLayout>){
        listLayout.clear()
        listLayout.addAll(list)
        this.notifyDataSetChanged()
    }

    override fun getItemCount()=listLayout.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.nameLayout.text=listLayout[position].nameLayout
        holder.descriptionLayout.text=listLayout[position].descriptionLayout
        holder.imageLayout.loadImage(listLayout[position].imageLayout)
        holder.itemView.setOnClickListener {
            val intent= Intent(this.context,DetailsLayoutActivity::class.java)
            var gson=Gson()
            val gsonLayout=gson.toJson(listLayout[position])
            intent.putExtra(KEY_LAYOUT,gsonLayout)
            context.startActivity(intent)
        }
    }


    class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        val nameLayout: TextView=view.findViewById(R.id.name_layout)
        val descriptionLayout: TextView=view.findViewById(R.id.text_view_description)
        val imageLayout: ImageView=view.findViewById(R.id.image_view_layout)
    }
}