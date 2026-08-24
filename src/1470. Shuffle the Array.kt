fun shuffle(nums: IntArray, n: Int): IntArray {
    val ans = IntArray(2 * n)
    for (i in 0 until n) {
        ans[2 * i] = nums[i]
        ans[2 * i + 1] = nums[n + i]
    }
    return ans
}

fun main() {
    println(shuffle(nums = intArrayOf(2, 5, 1, 3, 4, 7), n = 3).joinToString())
}