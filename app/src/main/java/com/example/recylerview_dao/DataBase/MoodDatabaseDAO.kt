package com.example.recylerview_dao.DataBase

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface MoodDatabaseDAO {
            @Insert
            fun insert(moodData: Mood_Data_Entity)

            @Update
            fun update(moodDataEntity: Mood_Data_Entity)

            @Query("Select * from daily_mood_table where dayId= :key")
            fun get(key: Long): Mood_Data_Entity

            @Query("Delete from daily_mood_table")
            fun clear()

            @Query("Select * from daily_mood_table ORDER BY dayId DESC")
            fun getAllMoods(): LiveData<List<Mood_Data_Entity>>

            @Query("Select * from daily_mood_table ORDER BY dayId DESC LIMIT 1")
            fun getAllNights(): Mood_Data_Entity?
}