package com.example.queote.domain.usecase

import com.example.queote.domain.QuoteRepository
import com.example.queote.domain.model.QuoteModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetQuoteRandomUseCase @Inject constructor(private val quoteRepository: QuoteRepository) {
    suspend fun getQuoteRandom(): Flow<QuoteModel> = quoteRepository.getQuoteRandom()

}