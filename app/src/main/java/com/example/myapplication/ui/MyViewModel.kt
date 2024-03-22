package com.example.myapplication.ui

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.data.dto.Response
import com.example.myapplication.domain.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MyViewModel @Inject constructor(var repository: Repository) : ViewModel() {

    private val _data = MutableLiveData<Response>()

    val data: LiveData<Response>
        get() = _data

     fun getdata() {
         viewModelScope.launch {
             var response = repository.getData()
             Log.v("kishore", response.toString())
             _data.value=response
         }
     }
}