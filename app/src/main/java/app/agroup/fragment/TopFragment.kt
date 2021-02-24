package app.agroup.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import app.agroup.activity.R
import app.agroup.adapter.TopRecyclerViewAdapter
import app.agroup.viewmodel.TopViewModel

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class TopFragment : Fragment() {

    private val topViewModel = TopViewModel()

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_top, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val topRecyclerView = view.findViewById<RecyclerView>(R.id.top_recycler_view)
        topRecyclerView.adapter = TopRecyclerViewAdapter(topViewModel.resultRaw)
        topRecyclerView.layoutManager = LinearLayoutManager(context)
    }
}