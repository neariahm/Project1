package com.example.project1.ui.main

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.project1.DogPhoto
import com.example.project1.DogPhotoAPI
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {
    private val _currentlyDisplayedDogPhoto = MutableLiveData<DogPhoto>()
    val currentlyDisplayedDogPhoto: LiveData<DogPhoto> = _currentlyDisplayedDogPhoto

    init {
        getRandomDogPhoto()
    }

    fun getRandomDogPhoto(){
       viewModelScope.launch{
           _currentlyDisplayedDogPhoto.value = DogPhotoAPI.DogApi.retrofitService.getRandomDogPhoto()
           Log.e("Neariah", "The results ")
       }
   }
}