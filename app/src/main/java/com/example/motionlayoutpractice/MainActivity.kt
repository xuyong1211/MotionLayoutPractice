package com.example.motionlayoutpractice

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val motion = findViewById<MotionLayout>(R.id.motion)
//        val rv1 = findViewById<RecyclerView>(R.id.rv_1)
//        rv1.layoutManager = LinearLayoutManager(this,RecyclerView.VERTICAL,false)
//        val adapter = SimpleTextAdapter(arrayListOf("content","content","content","content",
//                "content","content","content","content","content","content","content","content","content","content","content","content","content",
//                "content","content","content","content","content","content","content","content","content","content","content","content","content",
//                "content","content","content","content","content","content","content","content","content","content"))
//        adapter.setLitener {
//            motion.transitionToState(R.id.mid_state)
//        }
//        rv1.adapter = adapter
        findViewById<Button>(R.id.button).setOnClickListener {
            motion.transitionToState(R.id.mid_state)
        }
        val rv2 = findViewById<MyRecycletView>(R.id.rv_2)
        rv2.layoutManager = LinearLayoutManager(this,RecyclerView.VERTICAL,false)
        rv2.adapter = SimpleTextAdapter(arrayListOf("content_2","content_2","content_2","content_2","content_2","content_2","content_2","content_2","content_2","content_2","content_2"))

    }
}