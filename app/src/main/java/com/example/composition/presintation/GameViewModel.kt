package com.example.composition.presintation

import androidx.lifecycle.ViewModel
import com.example.composition.data.GameRepositoriImpl
import com.example.composition.domain.entity.GameSettings
import com.example.composition.domain.entity.Level
import com.example.composition.domain.useCases.GenerateQuestionUseCase
import com.example.composition.domain.useCases.GetGameSettingsUseCase

class GameViewModel : ViewModel() {
    private lateinit var level: Level
    private lateinit var gameSettings: GameSettings

    private val repository = GameRepositoriImpl

    private val generateQuestionUseCase = GenerateQuestionUseCase(repository)
    private val getGameSettingsUseCase = GetGameSettingsUseCase(repository)

    fun StartGame(level: Level){
        this.level = level
        this.gameSettings =getGameSettingsUseCase(level)
    }
}