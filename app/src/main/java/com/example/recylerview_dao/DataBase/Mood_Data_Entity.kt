package com.example.recylerview_dao.DataBase

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "daily_mood_table")
data class Mood_Data_Entity(
    @PrimaryKey(autoGenerate = true)@ColumnInfo
    var dayId: Long = 0L,
    @ColumnInfo(name = "good_day")
    var goodDay: String ="",
    @ColumnInfo(name = "bad_day")
    var badDay: String = "",
    @ColumnInfo(name = "day_quality_rating")
    var dayQuality: Int = -1
)
