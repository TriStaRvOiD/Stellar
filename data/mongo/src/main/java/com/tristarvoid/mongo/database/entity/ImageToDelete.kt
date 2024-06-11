package com.tristarvoid.mongo.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.tristarvoid.util.Constants.IMAGE_TO_DELETE_TABLE

@Entity(tableName = IMAGE_TO_DELETE_TABLE)
data class ImageToDelete(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val remoteImagePath: String
)
