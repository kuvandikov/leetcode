fun buildArray(target: IntArray, n: Int): List<String> {
    val stack = mutableListOf<String>()
    var cnt = 0

    for (num in 1..target.last()) {
        stack.add("Push")
        if (num == target[cnt]) {
            cnt++
        } else {
            stack.add("Pop")
        }
    }

    return stack
}

fun main() {
    println(buildArray(target = intArrayOf(1,2,3), n = 3).joinToString())
}
