fun countStudents(students: IntArray, sandwiches: IntArray): Int {
    var circleStudentCount = 0
    var squareStudentCount = 0

    for (student in students) {
        if (student == 0) {
            circleStudentCount++
        } else {
            squareStudentCount++
        }
    }

    for (sandwich in sandwiches) {
        if (sandwich == 0 && circleStudentCount == 0) {
            return squareStudentCount
        }

        if (sandwich == 1 && squareStudentCount == 0) {
            return circleStudentCount
        }

        if (sandwich == 0) {
            circleStudentCount--
        } else {
            squareStudentCount--
        }
    }

    return 0
}
fun main() {
    println(countStudents(students = intArrayOf(1, 1, 1, 0, 0, 1), sandwiches = intArrayOf(1, 0, 0, 0, 1, 1)))
}