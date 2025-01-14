package com.dj.core.user.data.local

import androidx.room.Dao
import androidx.room.Query
import com.dj.core.base.BaseDao

@Dao
interface UserDao : BaseDao<UserEntity> {

    @Query("SELECT * FROM userentity WHERE id = :id LIMIT 1")
    fun getUser(id: String): UserEntity

    @Query("SELECT * FROM userentity LIMIT 1")
    fun getLastUser(): UserEntity

    @Query("DELETE FROM userentity WHERE id = :id")
    fun deleteUser(id: String)
}