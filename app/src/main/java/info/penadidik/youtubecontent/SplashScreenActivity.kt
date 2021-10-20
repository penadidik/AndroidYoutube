package info.penadidik.youtubecontent

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplashScreenActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)

        //berpindah ke kelas yang lain
        val intent = Intent(this, MainActivity::class.java)

        //countdown
        Handler().postDelayed({
            startActivity(intent) }
        ,3000)

    }

}