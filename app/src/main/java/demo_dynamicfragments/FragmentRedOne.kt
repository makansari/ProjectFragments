package demo_dynamicfragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.projectfragments.R
import kotlinx.android.synthetic.main.red_layout.view.*

class FragmentRedOne : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var v = inflater.inflate(R.layout.red_layout,container,false)

            v.buttonRed.setOnClickListener {
                var blueFrag = FragmentBlueOne()

                var bundle = Bundle()
                bundle.putString("key1","Ansari")

                blueFrag.arguments = bundle

                // its replaceing the layout with BLUE fragment
                fragmentManager?.beginTransaction()?.replace(R.id.dynamiclayout,blueFrag)?.commit()

            }

        return v
    }

}