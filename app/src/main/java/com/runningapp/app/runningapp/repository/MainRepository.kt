package com.runningapp.app.runningapp.repository

import com.runningapp.app.runningapp.db.Run
import com.runningapp.app.runningapp.db.RunDAO
import javax.inject.Inject

class MainRepository @Inject constructor(
    val runDAO: RunDAO

) {
    suspend fun insertRun(run: Run) = runDAO.insert(run)

    suspend fun deleteRun(run: Run) = runDAO.delete(run)

    fun getAllRunsSortedByDate() = runDAO.getAllRunsSortedByDate()

    fun getAllRunsSortedByDistance() = runDAO.getAllRunsSortedByDistance()

    fun getAllRunsSortedByCaloriesBurned() = runDAO.getAllRunsSortedByCaloriesBurned()

    fun getAllRunsSortedByTimeInMillis() = runDAO.getAllRunsSortedByTimeInMillis()

    fun getAllRunsSortedByAvgSpeed() = runDAO.getAllRunsSortedByAvgSpeed()

    fun getTotalAvgSpeed() = runDAO.getTotalAvgSpeed()

    fun getTotalDistanceInMeters() = runDAO.getTotalDistanceInMeters()

    fun getTotalTimeInMillis() = runDAO.getTotalTimeInMillis()

    fun getTotalCaloriesBurned() = runDAO.getTotalCaloriesBurned()

}