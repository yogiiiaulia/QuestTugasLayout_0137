package com.example.t4

import androidx.annotation.ColorRes
import androidx.annotation.StringRes

data class Student(
    @StringRes val nameRes: Int,
    @StringRes val phoneRes: Int,
    @StringRes val addressRes: Int,
    @ColorRes val bgColorRes: Int
)