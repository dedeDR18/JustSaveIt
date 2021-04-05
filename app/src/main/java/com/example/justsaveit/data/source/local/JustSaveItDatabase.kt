package com.example.justsaveit.data.source.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.justsaveit.data.source.local.entity.LinkEntity
import com.example.justsaveit.data.source.local.entity.NoteEntity
import com.example.justsaveit.data.source.local.room.JustSaveItDao

@Database(entities = [NoteEntity::class, LinkEntity::class], version = 1, exportSchema = false)
abstract class JustSaveItDatabase : RoomDatabase() {

    abstract fun justSaveItDao() : JustSaveItDao

    companion object {
        @Volatile
        private var INSTANCE : JustSaveItDatabase? = null

        fun getInstance(context: Context) : JustSaveItDatabase {
            if (INSTANCE == null) {
                synchronized(JustSaveItDatabase::class.java) {
                    INSTANCE = Room.databaseBuilder(
                            context.applicationContext,
                            JustSaveItDatabase::class.java,
                            "justsaveit_database"
                    ).build()
                }
            }
            return INSTANCE as JustSaveItDatabase
        }
    }
}