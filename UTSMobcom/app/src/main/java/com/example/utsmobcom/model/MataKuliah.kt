package com.example.utsmobcom.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class MataKuliah(
    @StringRes val nama: Int,
    @StringRes val sks:Int,
    @DrawableRes val img:Int
)
