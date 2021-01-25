package demo_staticfragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.projectfragments.R
import kotlinx.android.synthetic.main.red_layout.view.*

class FragmentRedStaticOne : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var v = inflater.inflate(R.layout.red_layout,container,false)
            var myInerface = activity as MyInerface

            v.buttonRed.setOnClickListener {
                myInerface.myData("Ansari Welcome")
            }

        return v
    }

}