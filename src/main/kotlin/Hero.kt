class Hero(
    override var hp: Int,
    override val dmg: Int,
    val name: String,
    override var killed : Boolean = false
) : Creature() {
    private var minion : Minion? = null

    fun setMinion(heroMinion: Minion) {
        minion = heroMinion
    }

    override fun getInfo() {
        if (killed) {
            println("You are killed, wait for respawn")
            return
        }
        println("Your hp : $hp, your dmg : $dmg")
        minion?.let {
            println("Wow, you have minion")
            it.getInfo()
        }
    }

    fun fight(anotherHero: Hero) {
        val hit1 = hit()
        val hit2 = anotherHero.hit()
        hp -= hit2
        anotherHero.hp -= hit1
        println("Wow, a multiplayer fight")
        if (hp <= 0) {
            killed = true
        }
        if (anotherHero.hp <= 0) {
            anotherHero.killed = true
        }
    }

    override fun fight(anotherCreature: Creature) {
        var hit1 = hit()
        val hit2 = anotherCreature.hit()
        hp -= hit2
        anotherCreature.getDamaged(hit1)
        minion?.let {
            hit1 = it.hit()
            it.getDamaged(hit2)
            anotherCreature.getDamaged(hit1)
        }
        if (hp <= 0) {
            killed = true
        }
    }
}