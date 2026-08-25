import kotlin.math.abs

fun findDisappearedNumbers(nums: IntArray): List<Int> {

    for (num in nums) {
        val index = abs(num) - 1
        if (nums[index] > 0) {
            nums[index] = -nums[index]
        }
    }
    val ans = mutableListOf<Int>()
    for (i in nums.indices) {
        if (nums[i] > 0) {
            ans.add(i + 1)
        }
    }
    return ans
}

fun main() {
    println(findDisappearedNumbers(intArrayOf(1, 1)).joinToString())
}