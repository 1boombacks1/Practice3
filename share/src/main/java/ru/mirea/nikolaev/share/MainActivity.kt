package ru.mirea.nikolaev.share

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        работа action_pick
//        val intent = Intent(Intent.ACTION_PICK)
//        intent.type = "*/*"
//        startActivityForResult(intent,1)
//        работа ACTION_SEND

        val intent = Intent(Intent.ACTION_SEND)
        intent.type = "*/*"
        intent.putExtra(Intent.EXTRA_TEXT, "MIREA")
        startActivity(Intent.createChooser(intent, "Выбор за вами!"))
    }
}