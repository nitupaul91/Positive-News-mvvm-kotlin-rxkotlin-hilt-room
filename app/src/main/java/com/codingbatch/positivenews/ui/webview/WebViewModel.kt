package com.codingbatch.positivenews.ui.webview

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.MutableLiveData
import com.codingbatch.positivenews.ui.base.BaseViewModel

class WebViewModel @ViewModelInject constructor(
) : BaseViewModel() {

    val isLoading = MutableLiveData<Boolean>()
    val isBackPressed = MutableLiveData<Boolean>()
    val isError = MutableLiveData<Boolean>()
    val isMoreOptionsClicked = MutableLiveData<Boolean>()

    fun onMoreOptionsClicked() {
        isMoreOptionsClicked.value = true
    }

    fun loadingStarted() {
        isLoading.value = true
    }

    fun loadingComplete() {
        isLoading.value = false
    }

    fun onBackPressed() {
        isBackPressed.value = true
    }

    fun setError() {
        isError.value = true
        //todo add vector background for error
    }
}