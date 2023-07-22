package com.stringsattached.chatgpt.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.stringsattached.chatgpt.api.ChatGPTAPI

class HomeViewModel(
    private val api: ChatGPTAPI
) : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    val text: LiveData<String> = _text
}