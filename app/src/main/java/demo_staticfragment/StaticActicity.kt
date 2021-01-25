package demo_staticfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.projectfragments.R

class StaticActicity : AppCompatActivity(),MyInerface {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_static_acticity)
    }

    override fun myData(data: String) {

        var blueFrag = supportFragmentManager.findFragmentById(R.id.fragmentstaticBlue) as FragmentBlueStaticOne

        blueFrag.gettingData(data)
    }
}