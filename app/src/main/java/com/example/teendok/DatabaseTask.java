package com.example.teendok;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.Query;

import java.util.List;

@Entity
public class DatabaseTask {
    @PrimaryKey
    public int id;

    @ColumnInfo(name = "task")
    public String task;

    @ColumnInfo(name = "date")
    public long date;
}

