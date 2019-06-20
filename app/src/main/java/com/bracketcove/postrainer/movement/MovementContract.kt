package com.bracketcove.postrainer.movement

import com.wiseassblog.domain.domainmodel.Movement

interface MovementContract {
    interface View {
        fun setTootlbarTitle(title: String)
        fun setParallaxImage(resources: List<String>)
        fun setTargets(targets: List<String>)
        fun setFrequency(frequency: String)
        fun setIsTimed(isTimed: Boolean)
        fun setTimeOrRepetitions(value: String)
        fun setDifficulty(difficulty: String)
        fun setDescription(description: String)
        fun setInstructions(instructions: String)
        fun showMessage(message: String)
        fun startMovementListView()
    }

    interface ViewModel {
        fun setMovement(movement: Movement)
        fun getMovement(): Movement?
    }
}

sealed class MovementEvent {
    object OnShowVideoClick : MovementEvent()
    data class OnStart(val movementId: String?): MovementEvent()
}