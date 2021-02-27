@file:Suppress("UNUSED_PARAMETER")

import kotlin.Boolean as Boolean

abstract class Creature {
    open var hp : Int = 0
    open val dmg : Int = 0
    open var killed : Boolean = false

    abstract fun getInfo()

    fun hit() : Int {
        return if (killed) {
            0
        } else {
            dmg
        }
    }

    open fun fight(anotherCreature: Creature) {
        val hit1 = hit()
        val hit2 = anotherCreature.hit()
        hp -= hit2
        anotherCreature.hp -= hit1
        if (hp <= 0) {
            killed = true
        }
        if (anotherCreature.hp <= 0) {
            anotherCreature.killed = true
        }
    }
}