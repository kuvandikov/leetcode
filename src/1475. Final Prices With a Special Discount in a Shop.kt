fun finalPrices(prices: IntArray): IntArray {
    val ans = IntArray(prices.size)
    for (i in 0 until prices.size) {
        ans[i] = prices[i]
        for (j in i + 1 until prices.size) {
            if (prices[j] <= prices[i]) {
                ans[i] = prices[i] - prices[j]
                break
            }
        }
    }
    return ans
}
fun main() {
    println(finalPrices(intArrayOf(8,4,6,2,3)).joinToString())
}