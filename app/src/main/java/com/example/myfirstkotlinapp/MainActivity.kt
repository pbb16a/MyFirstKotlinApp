package com.example.myfirstkotlinapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

//class MainActivity : AppCompatActivity() {
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//    }
//}
//const val EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE"
const val EXTRA_MES1 = "com.example.myfirstapp.MES1"
const val EXTRA_MES2 = "com.example.myfirstapp.MES2"
const val EXTRA_MES3 = "com.example.myfirstapp.MES3"
const val EXTRA_MES4 = "com.example.myfirstapp.MES4"
const val EXTRA_MES5 = "com.example.myfirstapp.MES5"
const val EXTRA_MES6 = "com.example.myfirstapp.MES6"
const val EXTRA_MES7 = "com.example.myfirstapp.MES7"
const val EXTRA_MES8 = "com.example.myfirstapp.MES8"
const val EXTRA_MES9 = "com.example.myfirstapp.MES9"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /** Called when the user taps the Send button */
    fun sendMessage(view: View) {
        val lib_1 = findViewById<EditText>(R.id.lib1)
        val lib_2 = findViewById<EditText>(R.id.lib2)
        val lib_3 = findViewById<EditText>(R.id.lib3)
        val lib_4 = findViewById<EditText>(R.id.lib4)
        val lib_5 = findViewById<EditText>(R.id.lib5)
        val lib_6 = findViewById<EditText>(R.id.lib6)
        val lib_7 = findViewById<EditText>(R.id.lib7)
        val lib_8 = findViewById<EditText>(R.id.lib8)
        val lib_9 = findViewById<EditText>(R.id.lib9)
        val m1 = lib_1.text.toString()
        val m2 = lib_2.text.toString()
        val m3 = lib_3.text.toString()
        val m4 = lib_4.text.toString()
        val m5 = lib_5.text.toString()
        val m6 = lib_6.text.toString()
        val m7 = lib_7.text.toString()
        val m8 = lib_8.text.toString()
        val m9 = lib_9.text.toString()

//        val message = "I think I am qualified for this job because I'm " + m1 + ". I got a college education at the "+ m2 + " and I majored in " + m3 + ". I consider myself very " + m4 + " because I'm a " + m5 + ". I have experience using "+m6+ " "+m7+ " and a " + m8 + ". I think these, among many other qualifications, make me right for this " + m9+ "job. Thank you."
        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
            putExtra(EXTRA_MES1, m1+".")
            putExtra(EXTRA_MES2, m2)
            putExtra(EXTRA_MES3, m3+".")
            putExtra(EXTRA_MES4, m4)
            putExtra(EXTRA_MES5, m5+".")
            putExtra(EXTRA_MES6, m6)
            putExtra(EXTRA_MES7, m7)
            putExtra(EXTRA_MES8, m8)
            putExtra(EXTRA_MES9, m9)
        }
        startActivity(intent)
    }
}