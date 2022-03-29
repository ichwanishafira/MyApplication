package com.surya.myflexiblefragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    val btnSatu: Button = findViewById(R.id.btn_1)
        btnSatu.setOnClickListener(this)

    }



    override fun OnClick(v: View?){
        TODO(reason "Not yet inplemented")
    }
}