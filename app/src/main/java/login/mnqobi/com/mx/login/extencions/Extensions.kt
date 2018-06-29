package login.mnqobi.com.mx.login.extencions


import android.widget.ImageView
import com.squareup.picasso.Picasso
import login.mnqobi.com.mx.login.R

fun ImageView.loadImage(image: String){
    Picasso.get().load(image)
            .placeholder(R.drawable.ic_placeholder)
            .error(R.drawable.ic_placeholder)
            .into(this)
}