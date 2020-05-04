package com.example.level5task1.model

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize
import java.util.*


@Parcelize
@Entity(tableName = "Note")
data class Note (

    @ColumnInfo(name="title")
    var title: String,

    @ColumnInfo(name="lastUpdated")
//    var lastUpdated : Date,
    var lastUpdated : String,

    @ColumnInfo(name="text")
    var text : String,


    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name="id")
    var id : Long
): Parcelable