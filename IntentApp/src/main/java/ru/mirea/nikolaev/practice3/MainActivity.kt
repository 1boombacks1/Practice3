package ru.mirea.nikolaev.practice3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun onClickTime(view: View){
        val intent = Intent(this, SecondActivity::class.java)
        val dateInMillis = Calendar.getInstance().timeInMillis
        val sdf = SimpleDateFormat("yyyy-MM-dd HH:mm:ss",Locale.getDefault())
        val dateString = sdf.format(dateInMillis)
        intent.putExtra("currentDate", dateString)
        startActivity(intent)
    }
}