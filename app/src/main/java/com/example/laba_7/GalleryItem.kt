package com.example.laba_7

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

data class GalleryItem(
    @PrimaryKey var id: String = "",
    var title: String = "",
    @SerializedName("url_s") var url: String = ""
)