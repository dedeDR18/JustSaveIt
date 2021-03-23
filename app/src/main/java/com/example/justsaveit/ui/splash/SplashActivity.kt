package com.example.justsaveit.ui.splash

import android.animation.Animator
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import com.airbnb.lottie.LottieAnimationView
import com.example.justsaveit.MainActivity
import com.example.justsaveit.R

class SplashActivity : AppCompatActivity() {

    private lateinit var sharedPref: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        sharedPref = getSharedPreferences("sharedPref", Context.MODE_PRIVATE)
        val isNightMode = sharedPref.getBoolean("nightMode", false)
        if (isNightMode){
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        } else {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        }


        val animSplash = findViewById<LottieAnimationView>(R.id.anim_splash)

        animSplash.addAnimatorListener(object : Animator.AnimatorListener{
            override fun onAnimationStart(p0: Animator?) {

            }

            override fun onAnimationEnd(p0: Animator?) {
                val intentMain = Intent(this@SplashActivity, MainActivity::class.java)
                startActivity(intentMain)
            }

            override fun onAnimationCancel(p0: Animator?) {

            }

            override fun onAnimationRepeat(p0: Animator?) {

            }

        })

    }


}