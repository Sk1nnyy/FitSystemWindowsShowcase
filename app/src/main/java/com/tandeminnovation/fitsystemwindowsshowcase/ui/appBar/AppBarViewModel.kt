package com.tandeminnovation.fitsystemwindowsshowcase.ui.appBar

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AppBarViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is a screen with appBar and fsw done right"
    }
    val text: LiveData<String> = _text
}