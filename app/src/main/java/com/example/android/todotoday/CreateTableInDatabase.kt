package com.example.android.todotoday

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity (tableName = "toDoList")
data class CreateTableInDatabase(

        @PrimaryKey(autoGenerate = true)
        var id: Int,

        @ColumnInfo(name = "toDoListItemColumn")
        var toDoListItem:String,

        @ColumnInfo(name = "toDoListItemTimer")
        var toDoListItemTimer:Int
)

