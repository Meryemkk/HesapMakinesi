package com.meryem.hesapmakinesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var sayi1: Double? = null
    var sayi2: Double? = null
    private lateinit var editText: EditText
    private lateinit var editText2: EditText
    private lateinit var button: Button
    private lateinit var button2: Button
    private lateinit var button3: Button
    private lateinit var button4: Button
    private lateinit var textView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editText = findViewById<EditText>(R.id.editText)
        editText2 = findViewById<EditText>(R.id.editText2)
        button = findViewById<Button>(R.id.button)
        button2 = findViewById<Button>(R.id.button2)
        button3 = findViewById<Button>(R.id.button3)
        button4 = findViewById<Button>(R.id.button4)
        textView = findViewById<TextView>(R.id.textView)
    }

    fun topla(view: View) {
        sayi1 = editText.text.toString().toDoubleOrNull()
        sayi2 = editText2.text.toString().toDoubleOrNull()
        if (sayi1!! == null || sayi2!! == null) {
            textView.text = "Sayı girmeyi unutmayınız"
        } else {
         textView . text ="Sonuç:${sayi1!!+sayi2!!}"
    }
}
    fun cikar(view: View) {
        sayi1 = editText.text.toString().toDoubleOrNull()
        sayi2 = editText2.text.toString().toDoubleOrNull()
        if(sayi1!! == null || sayi2!! == null) {
            textView.text="Sayı girmeyi unutmayınız"
        }else{
            textView.text="Sonuç:${sayi1!!-sayi2!!}"
        }
    }

    fun bol(view: View) {
        sayi1 = editText.text.toString().toDoubleOrNull()
        sayi2 = editText2.text.toString().toDoubleOrNull()
        if(sayi1!! == null || sayi2!! == null){
            textView.text="Sayi girmeyi unutmayın"
        }else{
            textView.text="Sonuç: ${sayi1!!/sayi2!!}"
        }
}
    fun carp(view: View){
        sayi1 = editText.text.toString().toDoubleOrNull()
        sayi2 = editText2.text.toString().toDoubleOrNull()
        if(sayi1!! == null || sayi2!!  == null){
            textView.text="Sayı girmeyi unutmayınız"
        }else{
               textView.text="Sonuç: ${sayi1!!*sayi2!!}"

        }
}
}