fun exclusiveTime(n: Int, logs: List<String>): IntArray {
    val result = IntArray(n)
    val stack = ArrayDeque<Int>()
    var prev = 0

    for (log in logs) {
        val parts = log.split(":")
        val id = parts[0].toInt()
        val isStart = parts[1] == "start"
        val time = parts[2].toInt()

        if (isStart) {
            if (stack.isNotEmpty()) {
                result[stack.last()] += time - prev
            }
            stack.addLast(id)
            prev = time
        } else {
            result[stack.removeLast()] += time - prev + 1
            prev = time + 1
        }
    }
    return result
}
fun main() {
    println(exclusiveTime(n = 2, logs = listOf("0:start:0","1:start:2","1:end:5","0:end:6")).joinToString())
}