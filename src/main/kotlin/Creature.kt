import kotlin.Boolean as Boolean

interface Creature {
    var hp : Int
    val dmg : Int
    var killed : Boolean
        get() = false
        set(value) {}

    fun getInfo() {
        println("Just abstraction, override me")
    }

    fun hit() : Int {
        if (killed) {
            return 0
        } else {
            return this.dmg
        }
    }

    fun fight(anotherCreature: Creature) {
        val hit1 = hit()
        val hit2 = anotherCreature.hit()
        this.hp -= hit2
        anotherCreature.hp -= hit1
        if (this.hp < 0) {
            this.killed = true
        }
        if (anotherCreature.hp < 0) {
            anotherCreature.killed = true
        }
    }
}