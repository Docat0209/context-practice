package com.example.stdcapp.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "歡迎來到首頁，典籍上方按鈕來查看最新資訊"
    }
    val text: LiveData<String> = _text
}