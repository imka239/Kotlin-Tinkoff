import kotlin.math.min

class Hero(override var hp: Int, override val dmg: Int, val name: String, override var killed : Boolean = false) : Creature {
    private var minion : Minion? = null

    fun setMinion(minion: Minion) {
        this.minion = minion
    }

    override fun getInfo() {
        if (this.killed) {
            println("You are killed, wait for respawn")
            return
        }
        println("Your hp : $hp, your dmg : $dmg")
        if (this.minion != null) {
            println("Wow, you have minion")
            this.minion!!.getInfo()
        }
    }

    fun fight(anotherHero: Hero) {
        val hit1 = hit()
        val hit2 = anotherHero.hit()
        this.hp -= hit2
        anotherHero.hp -= hit1
        println("Wow, a multiplayer fight")
        if (this.hp <= 0) {
            this.killed = true
        }
        if (anotherHero.hp <= 0) {
            anotherHero.killed = true
        }
    }

    override fun fight(anotherCreature: Creature) {
        var hit1 = hit()
        val hit2 = anotherCreature.hit()
        this.hp -= hit2
        anotherCreature.hp -= hit1
        if (this.minion != null) {
            hit1 = minion!!.hit()
            this.minion!!.hp -= hit2
            anotherCreature.hp -= hit1
            if (this.minion!!.hp <= 0) {
                this.minion!!.killed = true
            }
        }
        if (this.hp <= 0) {
            this.killed = true
        }
        if (anotherCreature.hp <= 0) {
            anotherCreature.killed = true
        }
    }
}