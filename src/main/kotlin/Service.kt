import javax.sql.rowset.Predicate

class Service {
    companion object {
        fun makeWorkingClass(): List<WorkingClass> {
            return DAO.getHuman().map {
                WorkingClass(
                    it.name, it.surname,
                    DAO.getWorkByPassport(it.passport).firm, DAO.getWorkByPassport(it.passport).nameOfWork, it.passport
                )
            }
        }

        fun sortWorkersByFirm(): List<WorkingClass> {
            return makeWorkingClass().sortedBy { it.firm }
        }

        fun groupWorkersByNameOfWork(): Map<String, List<WorkingClass>> {
            return makeWorkingClass().groupBy { it.nameOfWork }
        }

        fun amountOfWorkersForPredicate(predicate: (WorkingClass) -> Boolean): List<WorkingClass> {
            return makeWorkingClass().filter { predicate(it) }
        }
    }
}