package com.myproject.team_mungnolza_git_practice

abstract class PersonState

class Running : PersonState()
class Walking : PersonState()
class Idle : PersonState()

sealed interface ColorState {
    data object Blue : ColorState
    data object Black : ColorState
    data object White: ColorState
}


data object Blue : ColorState
data object Black : ColorState
data object White : ColorState


fun main(){
}