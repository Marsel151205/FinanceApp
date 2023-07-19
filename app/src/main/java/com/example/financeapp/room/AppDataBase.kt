package com.example.financeapp.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.financeapp.models.FinanceModel

@Database(entities = [FinanceModel::class], version = 1)
abstract class AppDataBase : RoomDatabase() {
    abstract fun financeDao(): FinanceDao
}