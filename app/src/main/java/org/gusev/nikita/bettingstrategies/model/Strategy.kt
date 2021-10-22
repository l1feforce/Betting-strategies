package org.gusev.nikita.bettingstrategies.model

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Entity
@Parcelize
data class Strategy(
    @PrimaryKey(autoGenerate = true) var id: Int = 0,
    @ColumnInfo val title: String = "",
    @ColumnInfo val image: Int = 0,
    @ColumnInfo val description: String = "",
    @ColumnInfo val isFavorite: Boolean = false
) : Parcelable