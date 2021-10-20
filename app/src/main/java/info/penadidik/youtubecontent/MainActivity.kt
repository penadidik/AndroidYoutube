package info.penadidik.youtubecontent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragment: FragmentTransaction = supportFragmentManager.beginTransaction()
        fragment.replace(R.id.placeFragment, MainFragment())
        fragment.commit()
//        Handler().postDelayed({
//            fragment.commit()
//        }, 1000)
    }

//    override fun onStart() {
//        super.onStart()
//        Toast.makeText(this, "Siklus hidup onStart!", Toast.LENGTH_SHORT).show()
//    }
//
//    override fun onPause() {
//        super.onPause()
//        Toast.makeText(this, "Siklus hidup onPause!", Toast.LENGTH_SHORT).show()
//    }
//
//    override fun onResume() {
//        super.onResume()
//        Toast.makeText(this, "Siklus hidup onResume!", Toast.LENGTH_SHORT).show()
//    }
//
//    override fun onDestroy() {
//        super.onDestroy()
//        Toast.makeText(this, "Siklus hidup onDestroy!", Toast.LENGTH_SHORT).show()
//    }
}