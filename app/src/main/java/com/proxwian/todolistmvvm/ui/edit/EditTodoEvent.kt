package com.proxwian.todolistmvvm.ui.edit

sealed class EditTodoEvent {
    data class OnTitleChange(val title: String): EditTodoEvent()
    data class OnDescChange(val desc: String): EditTodoEvent()
    object OnSaveTodoClick: EditTodoEvent()
}
