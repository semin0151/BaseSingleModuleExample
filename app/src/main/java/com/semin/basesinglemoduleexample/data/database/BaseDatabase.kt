package com.semin.basesinglemoduleexample.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.semin.basesinglemoduleexample.data.dao.SampleDao
import com.semin.basesinglemoduleexample.data.entity.SampleEntity

@Database(
    version = 1,
    exportSchema = false,
    entities = [SampleEntity::class]
)
abstract class BaseDatabase : RoomDatabase() {
    companion object {
        const val SAMPLE_TABLE: String = "sample_table"
    }

    abstract fun sampleDao(): SampleDao
}