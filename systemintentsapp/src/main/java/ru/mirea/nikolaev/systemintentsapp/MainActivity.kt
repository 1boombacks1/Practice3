package ru.mirea.nikolaev.systemintentsapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickCall(view:View){
        val intent = Intent(Intent.ACTION_DIAL)
        intent.data = Uri.parse("tel:89141043059")
        startActivity(intent)
    }

    fun onClickOpenBrowser(view:View){
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse("https://www.vk.com")
        startActivity(intent)
    }

    fun onClickOpenMap(view:View){
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse("geo:55.749479,37.613944")
        startActivity(intent)
    }
}