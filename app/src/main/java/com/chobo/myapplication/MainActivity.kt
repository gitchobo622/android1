package com.chobo.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.chobo.myapplication.databinding.ActivityMainBinding

//import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) { //앱이 최초 실행되었을 때 수행
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view) //xml 화면 뷰를 연결한다.

        //binding.tv_result.text = "헬로우월드"

    }
}