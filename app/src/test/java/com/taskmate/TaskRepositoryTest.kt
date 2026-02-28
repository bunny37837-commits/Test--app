package com.taskmate

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.runBlocking
import org.junit.Assert.assertEquals
import org.junit.Test

class TaskRepositoryTest {

    @Test
    fun addTask_trimsAndInsertsNonEmptyTitle() = runBlocking {
        val fakeDao = FakeTaskDao()
        val repository = TaskRepository(fakeDao)

        repository.addTask("  Buy milk  ")

        assertEquals(1, fakeDao.items.size)
        assertEquals("Buy milk", fakeDao.items.first().title)
    }

    @Test
    fun addTask_ignoresBlankTitle() = runBlocking {
        val fakeDao = FakeTaskDao()
        val repository = TaskRepository(fakeDao)

        repository.addTask("   ")

        assertEquals(0, fakeDao.items.size)
    }

    private class FakeTaskDao : TaskDao {
        val items = mutableListOf<TaskEntity>()
        private val flow = MutableStateFlow<List<TaskEntity>>(emptyList())

        override fun observeAllTasks(): Flow<List<TaskEntity>> = flow

        override suspend fun insertTask(task: TaskEntity) {
            items.add(task)
            flow.value = items.toList()
        }

        override suspend fun updateTask(task: TaskEntity) {
            val index = items.indexOfFirst { it.id == task.id }
            if (index >= 0) {
                items[index] = task
                flow.value = items.toList()
            }
        }

        override suspend fun deleteTask(task: TaskEntity) {
            items.removeIf { it.id == task.id }
            flow.value = items.toList()
        }
    }
}
