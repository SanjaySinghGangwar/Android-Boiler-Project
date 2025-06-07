package dev.sanjaygangwar.tempproject.ui.fragment.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import dev.sanjaygangwar.tempproject.models.data.VideoModelData
import dev.sanjaygangwar.tempproject.repository.Repository
import dev.sanjaygangwar.tempproject.utils.network.retrofit.Resource
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val repository: Repository
) : ViewModel() {

    private val _videoData = MutableLiveData<Resource<VideoModelData>>()
    val videoData: LiveData<Resource<VideoModelData>> get() = _videoData

    init {
        fetchVideoData()
    }

    // Function to fetch video data from the repository
    fun fetchVideoData() {
        viewModelScope.launch {
            _videoData.value = repository.getData()
        }
    }

    // Function to fetch all characters from the repository
    val data = repository.getAllCharacter()
}
