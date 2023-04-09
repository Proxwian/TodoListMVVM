package com.proxwian.todolistmvvm.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Todo(
    @PrimaryKey val id: Int? = null,
    val title: String,
    val desc: String?,
    val isDone: Boolean
)
