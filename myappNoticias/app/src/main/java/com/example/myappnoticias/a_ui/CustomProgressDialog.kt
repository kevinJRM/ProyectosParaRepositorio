package com.example.myappnoticias.a_ui

import android.app.Activity
import android.app.Dialog
import android.widget.ProgressBar
import android.widget.TextView
import androidx.cardview.widget.CardView
import android.content.Context
import android.graphics.BlendMode
import android.graphics.BlendModeColorFilter
import android.graphics.Color
import android.graphics.PorterDuff
import android.graphics.drawable.Drawable
import android.os.Build
import androidx.core.content.res.ResourcesCompat
import com.example.myappnoticias.R

class CustomProgressDialog(context: Context) {

    private val dialog : CustomDialog
    private val cpTitle : TextView
    private val cpCardView : CardView
    private val progressBar : ProgressBar

    fun start(title : String = ""){
        cpTitle.text = title
        dialog.show()
    }

    fun stop(){
        dialog.dismiss()
    }

    init {
        val inflater = (context as Activity).layoutInflater
        val view = inflater.inflate(R.layout.progress_dialog,null)

        cpTitle = view.findViewById(R.id.cp_txt_carga)
        cpCardView = view.findViewById(R.id.cp_cardview)
        progressBar = view.findViewById(R.id.cp_carga_progressBar)

        cpCardView.setCardBackgroundColor(Color.parseColor("#70000000"))

        setColorFilter(
            progressBar.indeterminateDrawable,
            ResourcesCompat.getColor(context.resources,R.color.purple_500,null)
        )

        cpTitle.setTextColor(Color.WHITE)

        dialog = CustomDialog(context)
        dialog.setContentView(view)


    }

    private fun setColorFilter(drawable : Drawable, color : Int){
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q){
            drawable.colorFilter = BlendModeColorFilter(color, BlendMode.SRC_ATOP)
        }else{
            @Suppress("DEPRECATION")
            drawable.setColorFilter(color, PorterDuff.Mode.SRC_ATOP)
        }
    }


    class CustomDialog(context : Context) : Dialog(context,R.style.CustomDialogTheme){
        init {
            window?.decorView?.rootView?.setBackgroundResource(R.color.purple_200)
            //window?.decorView?.setOnApplyWindowInsetsListener {  insets -> insets.consumeSystemWindowInsert() }
            window?.decorView?.setOnApplyWindowInsetsListener { _, windowInsets ->
                windowInsets.consumeSystemWindowInsets()
            }
        }
    }

}