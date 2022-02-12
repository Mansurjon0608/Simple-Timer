package com.mstar004.mvvm

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MainFactory(val application: Application, val text:String):ViewModelProvider.AndroidViewModelFactory(application){
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MainViewModel(application, text) as T
    }
}