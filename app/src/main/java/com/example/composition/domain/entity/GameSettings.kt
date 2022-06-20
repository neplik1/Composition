package com.example.composition.domain.entity

import java.io.Serializable

data class GameSettings (
    val maxSumValue: Int,
    val minCountOfRightAnswer: Int,
    val minPercentOfRightAnsweres:Int,
    val gameTimeSeconds:Int
):Serializable