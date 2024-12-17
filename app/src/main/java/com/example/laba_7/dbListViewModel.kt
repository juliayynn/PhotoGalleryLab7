package com.example.laba_7

import androidx.lifecycle.ViewModel
import com.bignerdranch.android.photogallery.PhotoRepository

class dbListViewModel : ViewModel() {
    private val crimeRepository = PhotoRepository.get()
    val photoListLiveData = crimeRepository.getPhotos()
}