package com.example.queote.data.local

import com.example.queote.core.util.toEntity
import com.example.queote.core.util.toListQuoteModel
import com.example.queote.core.util.toQuoteModel
import com.example.queote.data.local.daos.QuoteDao
import com.example.queote.domain.QuoteRepository
import com.example.queote.domain.model.QuoteModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject
import javax.inject.Singleton

class QuoteLocalDataSourceImpl  @Inject constructor(private val quoteDao: QuoteDao): QuoteLocalDataSource {
    override fun getQuotes(): Flow<List<QuoteModel>> {
        val quotes = quoteDao.getQuotes()
        return quotes.map { it.toListQuoteModel() }
    }

    override   fun getQuote(quoteId: Int): Flow<QuoteModel> {
        return  quoteDao.getQuote(quoteId).map { it.toQuoteModel()}
    }

    override fun getQuoteRandom(): Flow<QuoteModel> {
        return  quoteDao.getQuoteRandom().map { it.toQuoteModel() }
    }

    override suspend fun insertAll(quotes: List<QuoteModel>) {
        quoteDao.insertAll(quotes!!.map { it.toEntity()})
    }

    override suspend fun insert(quoteModel: QuoteModel) {
        quoteDao.insert(quoteModel.toEntity())
    }

}
