package com.mspaldingworks.lovelist.com.mspaldingworks.lovelist


import android.app.Application

import androidx.room.Room
import com.mspaldingworks.lovelist.ReasonRoomDatabase

//This class is called before the application starts, this will ensure that there is an instance of the database for us to use and can not be created again
class ReasonApplication : Application() {

    //Create a variable to hold the instance of our database to check against.
    var database: ReasonRoomDatabase? = null
        private set

    override fun onCreate() {
        super.onCreate()

        database = Room.databaseBuilder(applicationContext, ReasonRoomDatabase::class.java, DATABASE_NAME)
            .allowMainThreadQueries()
            .build()
    }

    companion object {
        val DATABASE_NAME = "Reason_database"
    }


}
