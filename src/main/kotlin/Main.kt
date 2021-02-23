fun main() {
    val badGuy = NPC(100, 30)
    val id1 = NPC(100, 30)
    val id2 = NPC(100, 30)
    badGuy.getInfo()
    id1.getInfo()
    id2.getInfo()
    val hero = Hero(200, 20, "imka239")
    val minion = Minion(300, 10)
    hero.setMinion(minion)
    for (i in 0 until 10) {
        badGuy.fight(hero)
        badGuy.getInfo()
        hero.getInfo()
        println()
    }
    val anotherHero = Hero(200, 20, "gamer228")
    hero.fight(anotherHero)
    anotherHero.getInfo()
    hero.getInfo()
    println()

    hero.fight(anotherHero)
    anotherHero.getInfo()
    hero.getInfo()
    println()
}