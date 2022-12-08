package io.github.sp0rk.designSystem.component

import androidx.annotation.Size
import com.jayasuryat.dowel.annotation.Dowel

@Dowel
data class Entry(
    @Size(30) val title: String,
    @Size(300) val content: String
)
