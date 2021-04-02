package com.tandeminnovation.fitsystemwindowsshowcase.ui.appBarWithError

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AppBarWithErrorViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is an screen with appBar with a wrong fsw applied"
    }
    val text: LiveData<String> = _text
}