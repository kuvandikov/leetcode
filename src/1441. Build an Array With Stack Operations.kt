fun buildArray(target: IntArray, n: Int): List<String> {
    val stack = mutableListOf<String>()
    var cnt = 0
    for (i in 1..n) {
        if (cnt < target.size) {
            if (target[cnt] == i) {
                stack.add("Push")
                cnt++
            } else {
                stack.add("Push")
                stack.add("Pop")
            }
        }
    }
    return stack
}

fun main() {
    println(buildArray(target = intArrayOf(1,2,3), n = 3).joinToString())
}
