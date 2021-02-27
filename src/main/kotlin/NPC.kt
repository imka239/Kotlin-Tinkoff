class NPC(override var hp: Int, override val dmg: Int, override var killed : Boolean = false) : Creature() {
    companion object {
        var id : Int = 0
    }
    private val npcId : Int = id

    init {
        id++
    }

    override fun getInfo() {
        if (killed) {
            println("NPC is killed")
            return
        }
        println("I'm just an NPC creature with hp: $hp, and damage: $dmg my Id: $npcId")
    }
}