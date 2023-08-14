package com.example.mad_practical5_21012011125

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //onclick event
        val browseButton:Button=findViewById(R.id.button)
        val editUrl:EditText=findViewById(R.id.editTextText)
        browseButton.setOnClickListener{
            openBrowser(editUrl.text.toString())
        }
        val callButton:Button=findViewById(R.id.button2)
        val editNum:EditText=findViewById(R.id.editTextPhone)
        callButton.setOnClickListener {
            toCall(editNum.text.toString())
        }
        val callLogButton:Button=findViewById(R.id.button3)
        callLogButton.setOnClickListener {
            openCallLog()
        }
        val galleryButton:Button=findViewById(R.id.button4)
        galleryButton.setOnClickListener {
            openGallery()
        }
        val cameraButton:Button=findViewById(R.id.button5)
        cameraButton.setOnClickListener {
            openCamera()
        }
        val alarmButton:Button=findViewById(R.id.button6)
        alarmButton.setOnClickListener {
            openAlarm()
        }
    }
    fun openBrowser(url:String)
    {
        Intent(Intent.ACTION_VIEW, Uri.parse(url)).also { startActivity(it) }

    }
    fun toCall(no:String)
    {

    }
    fun openCallLog()
    {

    }
    fun openGallery()
    {

    }

    fun openCamera()
    {

    }
    fun openAlarm()
    {

    }

}
