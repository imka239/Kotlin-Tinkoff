import java.util.*

fun main() {
    println(Service.sortWorkersByFirm())
    println(Service.makeWorkingClass())
    println(Service.groupWorkersByNameOfWork())
    println(Service.amountOfWorkersForPredicate { it.name[0] <= 'D' })
}