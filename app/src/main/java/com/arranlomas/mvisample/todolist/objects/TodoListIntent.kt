package com.arranlomas.mvisample.todolist.objects

import com.arranlomas.kontent.commons.objects.mvi.KontentIntent
import com.arranlomas.mvisample.models.TodoItemState

/**
 * Created by arran on 5/12/2017.
 */
internal sealed class TodoListIntent : KontentIntent() {
    class LoadTodoListItems : TodoListIntent()
    data class ChangeItemStatus(val itemId: Long, val itemStatus: TodoItemState) : TodoListIntent()
}
