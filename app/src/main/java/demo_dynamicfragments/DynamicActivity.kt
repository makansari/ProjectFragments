package demo_dynamicfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.projectfragments.R

class DynamicActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dynamic)

        var redFrag = FragmentRedOne()
        supportFragmentManager.beginTransaction().add(R.id.dynamiclayout,redFrag).commit()
    }
}