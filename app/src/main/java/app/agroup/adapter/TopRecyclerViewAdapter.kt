package app.agroup.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import app.agroup.activity.R
import app.agroup.entity.Result

class TopRecyclerViewAdapter(private val resultData: MutableList<Result>)
    : RecyclerView.Adapter<TopRecyclerViewAdapter.TopRecyclerViewHolder>() {


    /**
     * リスト一列分のViewを保持するクラス
     */
    class TopRecyclerViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var indexView = itemView.findViewById<TextView>(R.id.text_view_index)
        var fileNameView = itemView.findViewById<TextView>(R.id.text_view_file_name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TopRecyclerViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val itemView = layoutInflater.inflate(R.layout.view_holder_top, parent, false)
        return TopRecyclerViewHolder(itemView)
    }

    /**
     * Viewとデータの紐付け
     */
    override fun onBindViewHolder(holder: TopRecyclerViewHolder, position: Int) {
        holder.indexView.text = resultData[position].id.toString()
        holder.fileNameView.text = resultData[position].name
    }

    override fun getItemCount(): Int {
        return resultData.size
    }
}