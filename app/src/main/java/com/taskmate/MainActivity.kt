package com.taskmate

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val viewModel: TaskViewModel by viewModels {
        TaskViewModelFactory(TaskRepository(TaskDatabase.getDatabase(applicationContext).taskDao()))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val taskInput = findViewById<EditText>(R.id.taskInput)
        val addButton = findViewById<Button>(R.id.addButton)
        val emptyStateText = findViewById<TextView>(R.id.emptyStateText)
        val recyclerView = findViewById<RecyclerView>(R.id.taskRecyclerView)

        val adapter = TaskAdapter(
            onToggle = { task, isCompleted -> viewModel.toggleTask(task, isCompleted) },
            onDelete = { task -> viewModel.deleteTask(task) }
        )

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

        addButton.setOnClickListener {
            viewModel.addTask(taskInput.text.toString())
            taskInput.text?.clear()
        }

        viewModel.tasks.observe(this) { tasks ->
            adapter.submitList(tasks)
            emptyStateText.visibility = if (tasks.isEmpty()) View.VISIBLE else View.GONE
        }
    }
}
