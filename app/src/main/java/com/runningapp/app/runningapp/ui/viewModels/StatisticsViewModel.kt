package com.runningapp.app.runningapp.ui.viewModels

import androidx.lifecycle.ViewModel
import com.runningapp.app.runningapp.repository.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class StatisticsViewModel @Inject constructor(
    val mainRepository: MainRepository
):ViewModel() {

}