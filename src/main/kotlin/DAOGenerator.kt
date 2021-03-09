fun main() {
    val firms = listOf<String>("Vk", "Yandex", "Tinkoff", "MakDonalds")
    val nameOfWorks = listOf<String>("Software-Engineer", "QA-tester", "Cleaner", "Frontend-Engineer")
    val names = listOf<String>("Dmitriy", "Gennadi", "Ivan", "Alex")
    val surnames = listOf<String>("Gnatyuk", "Minin", "Zagretdinov", "Dolzanskiy")
    var id = 0;
    val users : MutableList<Human> = mutableListOf()
    for (i in names.indices) {
        for (j in surnames.indices) {
            users.add(Human(names[i], surnames[j], id++))
        }
    }
    id--
    val works : MutableList<Work> = mutableListOf()
    for (i in firms.indices) {
        for (j in nameOfWorks.indices) {
            works.add(Work(firms[i], nameOfWorks[j], id--))
        }
    }
    users.forEach {
        print("Human(\"${it.name}\",\"${it.surname}\", ${it.passport}),")
    }
    println()
    works.forEach {
        print("Work(\"${it.firm}\",\"${it.nameOfWork}\", ${it.passportOfWorker}),")
    }
}