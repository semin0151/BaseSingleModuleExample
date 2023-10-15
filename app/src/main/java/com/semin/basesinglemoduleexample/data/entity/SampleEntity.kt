package com.semin.basesinglemoduleexample.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.semin.basesinglemoduleexample.data.database.BaseDatabase

@Entity(
    tableName = BaseDatabase.SAMPLE_TABLE
)
data class SampleEntity (
    @PrimaryKey val name: String
)