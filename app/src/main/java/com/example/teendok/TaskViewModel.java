package com.example.teendok;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;

import java.util.List;

public class TaskViewModel extends AndroidViewModel {

    private TaskRepository mRepository;

    private LiveData<List<Task>> mAllWords;

    public TaskViewModel (Application application) {
        super(application);
        mRepository = new TaskRepository(application);
        mAllWords = mRepository.getAllTasks();
    }

    LiveData<List<Task>> getAllWords() { return mAllWords; }

    public void insert(Task task) { mRepository.insert(task); }
}
