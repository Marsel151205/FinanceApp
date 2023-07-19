package com.example.financeapp.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "financial_book")
data class FinanceModel(
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
    val sent: String,
    val spent: Int,
    val all: Int
)
