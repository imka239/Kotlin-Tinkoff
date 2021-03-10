@file:Suppress("UNUSED_PARAMETER")

import kotlin.Boolean as Boolean

abstract class Creature {
    protected open var hp : Int = 0
    protected open val dmg : Int = 0
    protected open var killed : Boolean = false

    abstract fun getInfo()

    fun hit() : Int {
        return if (killed) {
            0
        } else {
            dmg
        }
    }

    fun getDamaged(delta: Int) {
        if (delta < 0) {
            throw Exception("Damage should be positive")
        }
        hp -= delta
        if (hp <= 0) {
            killed = true
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