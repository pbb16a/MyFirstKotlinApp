package com.example.myfirstkotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DisplayMessageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        // Get the Intent that started this activity and extract the string
        val m_1 = intent.getStringExtra(EXTRA_MES1)
        val m_2 = intent.getStringExtra(EXTRA_MES2)
        val m_3 = intent.getStringExtra(EXTRA_MES3)
        val m_4 = intent.getStringExtra(EXTRA_MES4)
        val m_5 = intent.getStringExtra(EXTRA_MES5)
        val m_6 = intent.getStringExtra(EXTRA_MES6)
        val m_7 = intent.getStringExtra(EXTRA_MES7)
        val m_8 = intent.getStringExtra(EXTRA_MES8)
        val m_9 = intent.getStringExtra(EXTRA_MES9)

        // Capture the layout's TextView and set the string as its text
        val textView_m1 = findViewById<TextView>(R.id.textView_m1).apply {
            text = m_1
        }
        val textView_m2 = findViewById<TextView>(R.id.textView_m2).apply {
            text = m_2
        }
        val textView_m3 = findViewById<TextView>(R.id.textView_m3).apply {
            text = m_3
        }
        val textView_m4 = findViewById<TextView>(R.id.textView_m4).apply {
            text = m_4
        }
        val textView_m5 = findViewById<TextView>(R.id.textView_m5).apply {
            text = m_5
        }
        val textView_m6 = findViewById<TextView>(R.id.textView_m6).apply {
            text = m_6
        }
        val textView_m7 = findViewById<TextView>(R.id.textView_m7).apply {
            text = m_7
        }
        val textView_m8 = findViewById<TextView>(R.id.textView_m8).apply {
            text = m_8
        }
        val textView_m9 = findViewById<TextView>(R.id.textView_m9).apply {
            text = m_9
        }
    }
}
