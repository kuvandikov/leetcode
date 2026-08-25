import kotlin.math.abs
/**
 * **In-Place Marking Algorithm** (Sign Negation Technique)
 *
 * Finds the duplicate and missing numbers in the array.
 * Operates in-place without extra space by negating the values at corresponding indices to mark visited numbers.
 *
 * @param nums An array containing numbers from 1 to n.
 * @return An array containing [duplicate, missing].
 *
 * - **Time Complexity:** O(n) — iterates through the array twice.
 * - **Space Complexity:** O(1) — uses no additional memory (modifies input array in-place).
 */
fun findErrorNums(nums: IntArray): IntArray {
    var duplicate = -1
    var missing = -1

    for (num in nums) {
        val index = abs(num) - 1
        if (nums[index] < 0) {
            duplicate = abs(num)
        } else {
            nums[index] = -nums[index]
        }
    }

    for (i in nums.indices) {
        if (nums[i] > 0) {
            missing = i + 1
        }
    }

    return intArrayOf(duplicate, missing)
}

fun main() {
    println(findErrorNums(intArrayOf(2, 2)).joinToString())
}