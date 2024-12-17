package com.example.laba_7

import androidx.lifecycle.ViewModel

class dbListViewModel : ViewModel() {
    private val crimeRepository = PhotoRepository.get()
    val photoListLiveData = crimeRepository.getPhotos()
}