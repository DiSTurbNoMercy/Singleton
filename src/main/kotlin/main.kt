fun main() {
    val student1 = Student("Xever", "Anderson", "Berlin", 1997, false)
    val student2 = Student("Yaqub", "Johnson", "Texas", 1994, true)
    val student3 = Student("Corbin", "Johnson", "Texas", 1994, true)
    val student4 = Student("Fox", "Perez", "St. Petersburg", 1999, false)
    val student5 = Student("Everett", "Nelson", "Budapest", 1997, false)
    StudentDetails.addStudentRecord(student1)
    StudentDetails.addStudentRecord(student2)
    StudentDetails.addStudentRecord(student3)
    StudentDetails.addStudentRecord(student4)
    StudentDetails.addStudentRecord(student5)

    StudentDetails.listAllStudent()
    StudentDetails.removeStudentRecord(student1)

    println("\n-Исключить студента Xever-")
    StudentDetails.listAllStudent()

}

data class Student(var firstName: String, var lastName: String, var address: String, var birthYear: Int, var isProgrammer: Boolean) {
    var fullStudentRecord = "\nName: $firstName $lastName, \nAddress: $address, \nBirth Year: $birthYear, Programmer: $isProgrammer"
}

object StudentDetails {
    val studentDetails = mutableListOf<Student>()
    fun addStudentRecord(student: Student) {
        studentDetails.add(student)
    }
    fun removeStudentRecord(student: Student) {
        studentDetails.remove(student)
    }
    fun listAllStudent() {
        studentDetails.forEach {
            println(it.fullStudentRecord)
        }
    }
}