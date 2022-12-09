package io.github.sp0rk.domain.model

import androidx.annotation.Size
import com.jayasuryat.dowel.annotation.Dowel
import com.jayasuryat.dowel.annotation.DowelList

@Dowel
@DowelList
data class Entry(
    @Size(30) val title: String,
    @Size(300) val content: String
)
