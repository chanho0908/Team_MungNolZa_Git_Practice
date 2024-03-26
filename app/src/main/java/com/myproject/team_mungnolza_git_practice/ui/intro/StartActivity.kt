package com.myproject.team_mungnolza_git_practice.ui.intro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import com.myproject.team_mungnolza_git_practice.R
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class StartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
        initView()
    }

    private fun initView(){
        lifecycleScope.launch {
            delay(2000)
            startActivity(Intent(this@StartActivity, IntroActivity::class.java))
        }
    }
}