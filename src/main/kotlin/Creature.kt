@file:Suppress("UNUSED_PARAMETER")

import kotlin.Boolean as Boolean

interface Creature {
    var hp : Int
    val dmg : Int
    var killed : Boolean
        get() = false
        set(value) {}

    fun getInfo()

    fun hit() : Int {
        return if (killed) {
            0
        } else {
            dmg
        }
    }

    fun fight(anotherCreature: Creature) {
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