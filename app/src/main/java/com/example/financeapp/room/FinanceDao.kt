package com.example.financeapp.room

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.financeapp.models.FinanceModel

@Dao
interface FinanceDao {

    @Insert
    fun insert(financeModel: FinanceModel)

    @Query("SELECT * FROM financial_book")
    fun getAll(): LiveData<FinanceModel>

    @Update
    fun update(financeModel: FinanceModel)
}