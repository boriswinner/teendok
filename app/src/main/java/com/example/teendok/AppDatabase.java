package com.example.teendok;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = {DatabaseTask.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract DatabaseTasksDao databaseTasksDao();
}
