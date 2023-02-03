package com.rabea.navigationcomponentexample

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Scores(
    val bScore:Int,
    val eScore:Int,
    val mScore:Int) : Parcelable