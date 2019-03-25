package com.mspaldingworks.lovelist;

import com.mspaldingworks.lovelist.Reason;
import com.mspaldingworks.lovelist.ReasonDao;

public class ReasonRoomDatabase {
}

import com.example.myapplication.room.Models.Name;

import androidx.room.Database;
import androidx.room.RoomDatabase;

//Annotate this is the database class, give it entities of the models that are to be used and a version number
@Database(entities = {Reason.class}, version = 1, exportSchema = false)
public abstract class ReasonRoomDatabase extends ReasonRoomDatabase {

    //Define where our DAO for the database is
    public abstract ReasonDao ReasonDao();

}
