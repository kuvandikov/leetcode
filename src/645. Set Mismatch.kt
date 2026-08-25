fun findErrorNums(nums: IntArray): IntArray {
    val n = nums.size
    val count = IntArray(n + 1)
    var duplicate = -1
    var missing = -1

    for (num in nums) {
        count[num]++
    }

    for (i in 1..n) {
        if (count[i] == 2) duplicate = i
        if (count[i] == 0) missing = i
    }

    return intArrayOf(duplicate, missing)
}

fun main() {
    println(findErrorNums(intArrayOf(2, 2)).joinToString())
}