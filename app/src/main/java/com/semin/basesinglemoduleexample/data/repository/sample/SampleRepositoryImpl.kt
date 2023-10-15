package com.semin.basesinglemoduleexample.data.repository.sample

import com.semin.basesinglemoduleexample.data.repository.sample.source.SampleLocalDataSource
import com.semin.basesinglemoduleexample.data.repository.sample.source.SampleRemoteDataSource
import com.semin.basesinglemoduleexample.domain.repository.sample.SampleRepository

class SampleRepositoryImpl(
    private val localDataSource: SampleLocalDataSource,
    private val remoteDataSource: SampleRemoteDataSource
) : SampleRepository {

}