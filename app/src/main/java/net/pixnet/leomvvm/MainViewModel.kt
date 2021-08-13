package net.pixnet.leomvvm

import androidx.databinding.ObservableBoolean
import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel
import net.pixnet.leomvvm.DataModel.onDataReadyCallback

class MainViewModel : ViewModel() {
     val mData = ObservableField<String>()
     val isLoading = ObservableBoolean(false)

    private val dataModel = DataModel()

    fun refresh() {
        isLoading.set(true)
        dataModel.retrieveData(object : onDataReadyCallback {
            override fun onDataReady(data: String?) {
               mData.set(data)
                isLoading.set(false)
            }
        })
    }
}