fun dailyTemperatures(temperatures: IntArray): IntArray {
    val ans = IntArray(temperatures.size)
    val stack = ArrayDeque<Int>()
    for (i in temperatures.indices) {
        while (stack.isNotEmpty() && temperatures[i] > temperatures[stack.last()]){
            val temp = stack.removeLast()
            ans[temp] = i - temp
        }
        stack.addLast(i)
    }
    return ans
}
fun main() {
    println(dailyTemperatures(intArrayOf(73,74,75,71,69,72,76,73)).joinToString())
}
