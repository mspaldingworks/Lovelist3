package com.mspaldingworks.lovelist

interface ReasonDao {
}

class ReasonDao

@Entity(tableReason = "Reason_table")
class Reason(
    @param:NonNull @field:PrimaryKey
    @field:NonNull
    @field:ColumnInfo(reason = "reason")
    val reason: String
)
