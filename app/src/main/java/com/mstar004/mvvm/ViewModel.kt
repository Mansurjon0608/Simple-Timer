package com.mstar004.mvvm

import android.os.CountDownTimer
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel:ViewModel() {

    val liveData = MutableLiveData<String>()

   init {

       startTimer()
   }

    fun startTimer(){

        object : CountDownTimer(20000, 1000){
            override fun onTick(p0: Long) {

                liveData.value = (p0/1000).toString()
            }

            override fun onFinish() {

            }

        }.start()

    }
}