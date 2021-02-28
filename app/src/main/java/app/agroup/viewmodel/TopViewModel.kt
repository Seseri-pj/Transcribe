package app.agroup.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.distinctUntilChanged
import app.agroup.entity.Result

class TopViewModel: ViewModel() {
//    private val resultRaw = mutableListOf<Result>()
//    private val _results = MutableLiveData<List<Result>>(emptyList())
//    // クラス外に航海する場合は不変で無くてはならない (LiveDataの作法)
//    val results: LiveData<List<Result>> = _results.distinctUntilChanged()
//
//    fun addElement() {
//        val testData = listOf<String>("リスト1", "リスト2", "リスト3", "リスト4")
//        for ((index, data) in testData.withIndex()) resultRaw.add(Result(index, data))
//        _results.value = ArrayList(resultRaw)
//    }

    val resultRaw = mutableListOf<Result>()

    init {
        //val testData = listOf<String>("リスト1", "リスト2", "リスト3", "リスト4")
        //for ((index, data) in testData.withIndex()) resultRaw.add(Result(index, data))
    }
}