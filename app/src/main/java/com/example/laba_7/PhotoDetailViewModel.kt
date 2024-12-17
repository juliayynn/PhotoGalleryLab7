package com.example.laba_7

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.switchMap
import com.bignerdranch.android.photogallery.GalleryItem
import com.bignerdranch.android.photogallery.PhotoRepository

class PhotoDetailViewModel: ViewModel() {

    private val photoRepository = PhotoRepository.get()
    private val photoIdLiveData = MutableLiveData<String>()

    var photoLiveData: LiveData<GalleryItem?> =
        photoIdLiveData.switchMap() { photoId ->
            photoRepository.getPhoto(photoId)
        }

    fun loadCrime(photoId: String) {
        photoIdLiveData.value = photoId
    }

}