package com.taskmate

import android.graphics.Paint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TaskAdapter(
    private val onToggle: (TaskEntity, Boolean) -> Unit,
    private val onDelete: (TaskEntity) -> Unit
) : RecyclerView.Adapter<TaskAdapter.TaskViewHolder>() {

    private val items = mutableListOf<TaskEntity>()

    fun submitList(tasks: List<TaskEntity>) {
        items.clear()
        items.addAll(tasks)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_task, parent, false)
        return TaskViewHolder(view)
    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int = items.size

    inner class TaskViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val checkBox: CheckBox = itemView.findViewById(R.id.taskCheckBox)
        private val titleText: TextView = itemView.findViewById(R.id.taskTitle)
        private val deleteButton: ImageButton = itemView.findViewById(R.id.deleteButton)

        fun bind(task: TaskEntity) {
            checkBox.setOnCheckedChangeListener(null)
            checkBox.isChecked = task.isCompleted
            titleText.text = task.title
            titleText.paintFlags = if (task.isCompleted) {
                titleText.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG
            } else {
                titleText.paintFlags and Paint.STRIKE_THRU_TEXT_FLAG.inv()
            }

            checkBox.setOnCheckedChangeListener { _, isChecked ->
                onToggle(task, isChecked)
            }

            deleteButton.setOnClickListener {
                onDelete(task)
            }
        }
    }
}
