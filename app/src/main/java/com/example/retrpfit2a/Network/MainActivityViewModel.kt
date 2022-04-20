package com.example.retrpfit2a.Network

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class MainActivityViewModel : ViewModel() {

//Esta instancia el tutorial la tiene dentro del import
    val userNetwork:UserNetwork = UserNetwork()

    val myResponse: MutableLiveData<User> = MutableLiveData()
    val myResponseList: MutableLiveData<List<User>> = MutableLiveData()

    fun getPost() {
        viewModelScope.launch {
            myResponse.value = userNetwork.retrofit.getPost()
        }
    }

    fun getPosts(){
        viewModelScope.launch {
            myResponseList.value = userNetwork.retrofit.getPosts()
        }
    }
}