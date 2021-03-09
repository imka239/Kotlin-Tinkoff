class DAO {
    companion object {
        private val human: List<Human> = listOf(Human("Dmitriy","Gnatyuk", 0),Human("Dmitriy","Minin", 1),Human("Dmitriy","Zagretdinov", 2),Human("Dmitriy","Dolzanskiy", 3),Human("Gennadi","Gnatyuk", 4),Human("Gennadi","Minin", 5),Human("Gennadi","Zagretdinov", 6),Human("Gennadi","Dolzanskiy", 7),Human("Ivan","Gnatyuk", 8),Human("Ivan","Minin", 9),Human("Ivan","Zagretdinov", 10),Human("Ivan","Dolzanskiy", 11),Human("Alex","Gnatyuk", 12),Human("Alex","Minin", 13),Human("Alex","Zagretdinov", 14),Human("Alex","Dolzanskiy", 15))
        private val work: List<Work> = listOf(Work("Vk","Software-Engineer", 15),Work("Vk","QA-tester", 14),Work("Vk","Cleaner", 13),Work("Vk","Frontend-Engineer", 12),Work("Yandex","Software-Engineer", 11),Work("Yandex","QA-tester", 10),Work("Yandex","Cleaner", 9),Work("Yandex","Frontend-Engineer", 8),Work("Tinkoff","Software-Engineer", 7),Work("Tinkoff","QA-tester", 6),Work("Tinkoff","Cleaner", 5),Work("Tinkoff","Frontend-Engineer", 4),Work("MakDonalds","Software-Engineer", 3),Work("MakDonalds","QA-tester", 2),Work("MakDonalds","Cleaner", 1),Work("MakDonalds","Frontend-Engineer", 0))

        fun getWorkByPassport(pId : Int) : Work {
            return work.filter { it.passportOfWorker == pId}[0]
        }

        fun getHuman() : List<Human> {
            return human
        }

        fun getWork() : List<Work> {
            return work
        }
    }
}