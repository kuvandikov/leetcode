fun finalPrices(prices: IntArray): IntArray {
    val ans = prices.clone()
    val stack = ArrayDeque<Int>()

    for (i in prices.indices) {
        while (stack.isNotEmpty() && prices[stack.last()] >= prices[i]) {
            val idx = stack.removeLast()
            ans[idx] -= prices[i]
        }
        stack.addLast(i)
    }

    return ans
}
fun main() {
    println(finalPrices(intArrayOf(8,4,6,2,3)).joinToString())
}