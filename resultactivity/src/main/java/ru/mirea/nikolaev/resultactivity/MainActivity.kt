package ru.mirea.nikolaev.resultactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var textViewResult: TextView
    private val REQUEST_CODE = 143

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textViewResult = findViewById(R.id.answerText)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (data != null){
            val university = data.getStringExtra("name")
            setUniversityTextView(university?: "Неизвестно")
        }
    }

    fun onClickInputAnswer(view:View){
        val intent = Intent(this, DataActivity::class.java)
        startActivityForResult(intent, REQUEST_CODE)
    }

    private fun setUniversityTextView(university: String){
        textViewResult.text = university
    }
}