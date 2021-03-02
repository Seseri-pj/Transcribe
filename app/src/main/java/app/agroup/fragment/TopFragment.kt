package app.agroup.fragment

import android.os.Bundle
import android.util.Log
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
import app.agroup.entity.Result
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
        //val topAdapter = TopRecyclerViewAdapter(topViewModel.resultRaw)
        val topAdapter = TopRecyclerViewAdapter(createDummyList())
        topRecyclerView.adapter = topAdapter
        topRecyclerView.layoutManager = LinearLayoutManager(context)
        topRecyclerView.setHasFixedSize(true)
        // クリック処理
        topAdapter.setOnItemClickListener(
                object : TopRecyclerViewAdapter.OnItemClickListener {
                    // TODO 中身はレビュー後作る予定
                    override fun onItemClick(item: Result) {
                        Log.d("test", "たっぷされました")
                        // データを渡す処理

                        // 画面遷移処理
                    }
                }
        )
    }

    // サンプルデータ作成メソッド
    private fun createDummyList(): MutableList<Result> {
        var dummyList: MutableList<Result> = ArrayList()
        var data = Result(1, "てすと")

        // 20件のダミーデータを登録
        var i = 0
        while (i < 20) {
            i++
            dummyList.add(data)
        }
        return dummyList
    }
}