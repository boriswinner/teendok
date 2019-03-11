package com.example.teendok;

import android.app.Application;
import android.arch.lifecycle.LiveData;
import android.os.AsyncTask;

import java.util.List;

public class TaskRepository {

    private TaskDao mWordDao;
    private LiveData<List<Task>> mAllWords;

    TaskRepository(Application application) {
        TaskDatabase db = TaskDatabase.getDatabase(application);
        mWordDao = db.taskDao();
        mAllWords = mWordDao.getAll();
    }

    LiveData<List<Task>> getAllTasks() {
        return mAllWords;
    }


    public void insert (Task task) {
        new insertAsyncTask(mWordDao).execute(task);
    }

    private static class insertAsyncTask extends AsyncTask<Task, Void, Void> {

        private TaskDao mAsyncTaskDao;

        insertAsyncTask(TaskDao dao) {
            mAsyncTaskDao = dao;
        }

        @Override
        protected Void doInBackground(final Task... params) {
            mAsyncTaskDao.insertTask(params[0]);
            return null;
        }
    }
}
