package com.example.queote.domain.usecase

import com.example.queote.domain.QuoteRepository
import com.example.queote.domain.model.QuoteModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetQuoteUseCase @Inject constructor(private val quoteRepository: QuoteRepository) {
    suspend fun getQuote(quoteId: Int): Flow<QuoteModel> = quoteRepository.getQuote(quoteId)

}
