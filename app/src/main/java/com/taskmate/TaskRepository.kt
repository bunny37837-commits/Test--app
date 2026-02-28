package com.taskmate

import kotlinx.coroutines.flow.Flow

class TaskRepository(private val taskDao: TaskDao) {
    val tasks: Flow<List<TaskEntity>> = taskDao.observeAllTasks()

    suspend fun addTask(title: String) {
        val trimmedTitle = title.trim()
        if (trimmedTitle.isEmpty()) return
        taskDao.insertTask(TaskEntity(title = trimmedTitle))
    }

    suspend fun updateTask(task: TaskEntity) {
        taskDao.updateTask(task)
    }

    suspend fun deleteTask(task: TaskEntity) {
        taskDao.deleteTask(task)
    }
}
