package com.example.myapplication.domain

import com.example.myapplication.data.dto.Response

interface Repository {

   suspend fun getData() :Response
}