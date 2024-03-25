package com.myproject.team_mungnolza_git_practice

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AhnsMainActivity : AppCompatActivity() {
    lateinit var name:String
    lateinit var nickName:String
    lateinit var place:String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ahns_main)


        place = "송파"
        name = "최나연"
        nickName = "카리나"

        Toast.makeText(this,"$place $nickName $name",Toast.LENGTH_LONG).show()
    }
}