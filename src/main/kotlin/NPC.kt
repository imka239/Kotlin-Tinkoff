class NPC(override var hp: Int, override val dmg: Int, override var killed : Boolean = false) : Creature {
    companion object {
        var id : Int = 0
    }
    val NPC_id : Int = id

    init {
        id++
    }

    override fun getInfo() {
        if (this.killed) {
            println("NPC is killed")
            return
        }
        println("I'm just an NPC creature with hp: $hp, and damage: $dmg my Id: $NPC_id")
    }
}