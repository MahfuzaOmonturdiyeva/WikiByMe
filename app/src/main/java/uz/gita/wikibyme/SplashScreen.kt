package uz.gita.wikibyme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.airbnb.lottie.LottieAnimationView

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val lottie = findViewById<LottieAnimationView>(R.id.lottie)

        lottie.animate().translationX(2000F).setDuration(4000).startDelay=40000

        Handler().postDelayed({ startActivity(Intent(this, MainActivity::class.java)) }, 4500)
    }
}