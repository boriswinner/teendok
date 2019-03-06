package com.example.teendok;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.RoomDatabase;

import java.util.List;

@Dao
public interface DatabaseTasksDao {
    @Query("SELECT * FROM DatabaseTask")
    List<DatabaseTask> getAll();

    @Query("SELECT * FROM DatabaseTask WHERE id IN (:userIds)")
    List<DatabaseTask> loadAllByIds(int[] userIds);

    @Insert
    void insertAll(DatabaseTask... users);

    @Delete
    void delete(DatabaseTask user);
}

