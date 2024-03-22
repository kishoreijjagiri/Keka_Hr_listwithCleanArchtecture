package com.example.myapplication.domain

import okhttp3.Response

sealed class MyResponse {
    object Loading :MyResponse()
    data class Success(var data:com.example.myapplication.data.dto.Response):MyResponse()
    object Error:MyResponse()
}
