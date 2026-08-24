fun getConcatenation(nums: IntArray): IntArray {
    val ans = IntArray(2 * nums.size)
    for (i in nums.indices) {
        ans[i] = nums[i]
    }
    for (i in nums.indices) {
        ans[i + nums.size] = nums[i]
    }
    return ans
}

fun main() {
    println(getConcatenation(nums = intArrayOf(1,2,1)).joinToString())
}