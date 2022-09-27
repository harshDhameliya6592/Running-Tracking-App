package com.runningapp.app.runningapp.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

@TypeConverters(Converters::class)
@Database(entities = [Run::class], version = 1)
abstract class RunningDataBase : RoomDatabase() {

    abstract fun getRunDao(): RunDAO

}