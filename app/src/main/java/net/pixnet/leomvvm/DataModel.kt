package net.pixnet.leomvvm

import android.os.Handler

class DataModel {
    fun retrieveData(callback: onDataReadyCallback) {
        Handler().postDelayed(Runnable { callback.onDataReady("New Data") }, 1500)
    }

    interface onDataReadyCallback {
        fun onDataReady(data: String?)
    }
}