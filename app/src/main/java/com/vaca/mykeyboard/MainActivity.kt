package com.vaca.mykeyboard

import androidx.appcompat.app.AppCompatActivity
import android.widget.EditText
import android.os.Bundle
import android.text.InputType
import android.view.View
import com.vaca.mykeyboard.R
import com.vaca.mykeyboard.KeyboardUtil

class MainActivity : AppCompatActivity() {
    private var edit: EditText? = null
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edit = findViewById<View>(R.id.edit) as EditText
        edit!!.inputType = InputType.TYPE_NULL
        edit!!.setOnClickListener { KeyboardUtil.shared(this@MainActivity, edit).showKeyboard() }
    }
}