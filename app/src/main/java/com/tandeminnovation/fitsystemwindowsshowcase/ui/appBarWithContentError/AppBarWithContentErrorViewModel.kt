package com.tandeminnovation.fitsystemwindowsshowcase.ui.appBarWithContentError

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AppBarWithContentErrorViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is a screen with an appBar but the content doesn't have fsw applied correctly"
    }
    val text: LiveData<String> = _text
}