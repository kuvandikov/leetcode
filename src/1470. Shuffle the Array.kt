fun shuffle(nums: IntArray, n: Int): IntArray {
    val ans = IntArray(nums.size)
    var cnt = 0
    for (i in 0 until nums.size step 2) {
        ans[i] = nums[cnt]
        ans[i + 1] = nums[n + cnt]
        cnt++
    }
    return ans
}

fun main() {
    println(shuffle(nums = intArrayOf(2, 5, 1, 3, 4, 7), n = 3).joinToString())
}