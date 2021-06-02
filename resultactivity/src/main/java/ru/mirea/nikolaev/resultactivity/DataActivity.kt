package ru.mirea.nikolaev.resultactivity

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity

class DataActivity : AppCompatActivity() {

    private lateinit var editText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        setSupportActionBar(findViewById(R.id.toolbar))

        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        editText = findViewById(R.id.inputUniversity)
    }

    fun onClickSend(view:View){
        val intent = Intent()
        intent.putExtra("name", editText.text.toString())
        setResult(RESULT_OK, intent)
        finish()
    }
}