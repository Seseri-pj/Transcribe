package app.agroup.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import app.agroup.activity.R

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class TopFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_top, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var button = view.findViewById<Button>(R.id.button_first)
        button.setOnClickListener {
            findNavController().navigate(R.id.action_TopFragment_to_resultFragment)
        }
    }
}