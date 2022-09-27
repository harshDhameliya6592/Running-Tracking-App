package com.runningapp.app.runningapp.di

import android.content.Context
import androidx.room.Room
import com.runningapp.app.runningapp.db.RunningDataBase
import com.runningapp.app.runningapp.other.Constants.RUNNING_DATABASE_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideRunningDataBase(
        @ApplicationContext
        context: Context
    ) = Room.databaseBuilder(
        context,
        RunningDataBase::class.java,
        RUNNING_DATABASE_NAME
    ).build()

    @Singleton
    @Provides
    fun provideRunDao(db:RunningDataBase) = db.getRunDao()
}