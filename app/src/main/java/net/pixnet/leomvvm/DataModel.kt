package net.pixnet.leomvvm

import android.os.Handler


/*Model管理資料來源如API和本地資料庫*/
class DataModel {
    fun retrieveData(callback: onDataReadyCallback) {
        Handler().postDelayed(Runnable { callback.onDataReady("New Data") }, 1500)
    }

    interface onDataReadyCallback {
        fun onDataReady(data: String?)
    }
}