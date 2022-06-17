package com.example.composition.domain.entity

data class GameSettings (
    val maxSumValue: Int,
    val minCountOfRightAnswer: Int,
    val minPercentOfRightAnsweres:Int,
    val gameTimeSeconds:Int
)