class Minion(
    override var hp: Int,
    override val dmg: Int,
    override var killed : Boolean = false
) : Creature {

    override fun getInfo() {
        if (killed) {
            println("Your minion is killed, wait for respawn")
            return
        }
        println("Your minion's hp : $hp, and it's dmg : $dmg")
    }
}