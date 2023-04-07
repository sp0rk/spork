package io.github.sp0rk.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import java.io.Serializable

@Entity(tableName = "entries")
data class Entry(
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0,
    @SerializedName("name")
    val name: String,
    @SerializedName("value")
    val value: String,
    @SerializedName("security")
    val security: Int,
) : Serializable
