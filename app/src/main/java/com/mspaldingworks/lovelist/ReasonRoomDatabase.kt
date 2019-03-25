package com.mspaldingworks.lovelist.com.mspaldingworks.lovelist


import com.mspaldingworks.lovelist.ReasonDao

//Annotate this is the database class, give it entities of the models that are to be used and a version number
@Database(entities = { Reason.class }, version = 1, exportSchema = false)
abstract class ReasonRoomDatabase : RoomDatabase() {
    //Define where our DAO for the database is
    abstract fun ReasonDao(): ReasonDao

}