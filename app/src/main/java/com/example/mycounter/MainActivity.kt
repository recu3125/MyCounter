package com.example.mycounter

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.lang.Integer.max
import java.lang.Integer.min

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonSplus = findViewById<Button>(R.id.buttonSplus)
        val buttonSminus = findViewById<Button>(R.id.buttonSminus)
        val buttonplus = findViewById<Button>(R.id.buttonplus)
        val buttonminus = findViewById<Button>(R.id.buttonminus)
        val buttonreset = findViewById<Button>(R.id.buttonreset)
        val textview = findViewById<TextView>(R.id.textView)
        val clrMax = 255
        var cnt = 0;
        buttonSplus.setOnClickListener{
            cnt=cnt+10
            textview.text = "클릭횟수 : ${cnt}"
            textview.setTextColor(Color.rgb(max(min(100+cnt*5,clrMax),0),100,max(min(100-cnt*5,clrMax),0)))
        }
        buttonSminus.setOnClickListener{
            cnt=cnt-10
            textview.text = "클릭횟수 : ${cnt}"
            textview.setTextColor(Color.rgb(max(min(100+cnt*5,clrMax),0),100,max(min(100-cnt*5,clrMax),0)))
        }
        buttonplus.setOnClickListener{
            cnt=cnt+1
            textview.text = "클릭횟수 : ${cnt}"
            textview.setTextColor(Color.rgb(max(min(100+cnt*5,clrMax),0),100,max(min(100-cnt*5,clrMax),0)))
        }
        buttonminus.setOnClickListener{
            cnt=cnt-1
            textview.text = "클릭횟수 : ${cnt}"
            textview.setTextColor(Color.rgb(max(min(100+cnt*5,clrMax),0),100,max(min(100-cnt,clrMax),0)))
        }
        buttonreset.setOnClickListener{
            cnt=0
            textview.text = "클릭횟수 : ${cnt}"
            textview.setTextColor(Color.rgb(max(min(100+cnt*5,clrMax),0),100,max(min(100-cnt*5,clrMax),0)))
        }
    }
}