package demo_dynamicfragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.projectfragments.R
import kotlinx.android.synthetic.main.blue_layout.view.*

class FragmentBlueOne : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var v = inflater.inflate(R.layout.blue_layout,container,false)

           var data = arguments?.getString("key1")
                v.textViewBlue.setText(data)
        return v
    }

}