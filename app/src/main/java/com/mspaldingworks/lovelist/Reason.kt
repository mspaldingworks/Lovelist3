package com.mspaldingworks.lovelist.com.mspaldingworks.lovelist

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableReason = "reason_table")
class Reason(
    @field:PrimaryKey
    @field:ColumnInfo(reason = "reason")
    val reason: String
)