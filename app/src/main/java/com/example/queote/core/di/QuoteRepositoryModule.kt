package com.example.queote.core.di

import com.example.queote.data.local.QuoteLocalDataSource
import com.example.queote.data.local.QuoteLocalDataSourceImpl
import com.example.queote.data.local.QuoteRepositoryImpl
import com.example.queote.domain.QuoteRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class QuoteRepositoryModule {

    @Binds
    abstract fun bindQuoteRepository(quoteRepositoryImpl: QuoteRepositoryImpl):
            QuoteRepository

    @Binds
    abstract fun bindQuoteLocalDataSource(quoteLocalDataSourceImpl: QuoteLocalDataSourceImpl):
            QuoteLocalDataSource

}