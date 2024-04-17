package com.andrew.cryptocurrencyapp.data.remote.dto

import com.andrew.cryptocurrencyapp.domain.model.CoinDetail
import com.google.gson.annotations.SerializedName

data class CoinDetailDto(
    val id: String,
    val name: String,
    val symbol: String,
    val rank: Int,
    @SerializedName("is_new") val isNew: Boolean,
    @SerializedName("is_active") val isActive: Boolean,
    val type: String,
    val logo: String,
    val tags: List<Tag>,
    val team: List<TeamMember>,
    val description: String,
    val message: String,
    @SerializedName("open_source") val openSource: Boolean,
    @SerializedName("started_at") val startedAt: String,
    @SerializedName("development_status") val developmentStatus: String,
    @SerializedName("hardware_wallet") val hardwareWallet: Boolean,
    @SerializedName("proof_type") val proofType: String,
    @SerializedName("org_structure") val orgStructure: String,
    @SerializedName("hash_algorithm") val hashAlgorithm: String,
    val links: Links,
    @SerializedName("links_extended") val linksExtended: List<LinksExtended>,
    @SerializedName("whitepaper") val whitePaper: WhitePaper,
    @SerializedName("first_data_at") val firstDataAt: String,
    @SerializedName("last_data_at") val lastDataAt: String
)


data class Tag(
    val id: String,
    val name: String,
    @SerializedName("coin_counter") val coinCounter: Int,
    @SerializedName("ico_counter") val icoCounter: Int,
)


data class TeamMember(
    val id: String, val name: String, val position: String
)


data class Links(
    val explorer: List<String>,
    val facebook: List<String>,
    val reddit: List<String>,
    @SerializedName("source_code") val sourceCode: List<String>,
    val website: List<String>,
    val youtube: List<String>
)


data class LinksExtended(
    val url: String, val type: String, val stats: Stats? = null
)


data class Stats(
    val subscribers: Long? = null,
    val contributors: Int? = null,
    val stars: Int? = null,
    val followers: Int? = null
)


data class WhitePaper(
    val link: String, val thumbnail: String
)

fun CoinDetailDto.toCoinDetail(): CoinDetail {
    return CoinDetail(
        coinId = id,
        name = name,
        description = description,
        symbol = symbol,
        rank = rank,
        isActive = isActive,
        tags = tags,
        team = team,
    )
}

