package com.andrew.cryptocurrencyapp.domain.repository

import com.andrew.cryptocurrencyapp.data.remote.dto.CoinDetailDto
import com.andrew.cryptocurrencyapp.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}