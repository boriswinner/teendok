package com.example.teendok;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface TaskDao {
    @Query("SELECT * FROM word_table")
    LiveData<List<Task>> getAll();

    @Query("SELECT * FROM word_table WHERE date = (:date)")
    List<Task> loadByDate(long date);

    @Insert
    void insertTask(Task task);

    @Delete
    void deleteTask(Task task);
}

