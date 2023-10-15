package com.semin.basesinglemoduleexample.data.repository.sample.source

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import com.semin.basesinglemoduleexample.data.dao.SampleDao

class SampleLocalDataSource(
    private val dataStore: DataStore<Preferences>,
    private val dao: SampleDao
) {

}