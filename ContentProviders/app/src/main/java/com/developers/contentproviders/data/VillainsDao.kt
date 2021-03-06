package com.developers.contentproviders.data

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import android.database.Cursor
import android.arch.persistence.room.Update


/**
 * Created by Amanjeet Singh on 25/11/17.
 */
@Dao
interface VillainsDao {

    @Query("SELECT COUNT(*) FROM " + Villains.TABLE_NAME)
    fun count(): Int

    @Query("SELECT * FROM " + Villains.TABLE_NAME)
    fun selectAll(): Cursor

    @Insert
    fun insert(villains: Villains): Long

    @Query("DELETE FROM " + Villains.TABLE_NAME + " WHERE " + Villains.COLUMN_ID + " = :id")
    fun deleteById(id: Long): Int

    @Query("SELECT * FROM " + Villains.TABLE_NAME + " WHERE " + Villains.COLUMN_ID + " = :id")
    fun selectById(id: Long): Cursor

    @Update
    fun update(villains: Villains): Int


}