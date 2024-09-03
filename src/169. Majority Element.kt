fun majorityElement(nums: IntArray): Int {
    var majorityElement: Int? = null
    var count = 0

    for (num in nums) {
        if (count == 0) {
            majorityElement = num
        }
        count += if (num == majorityElement) 1 else -1
    }

    // Assuming that the majority element always exists
    return majorityElement!!
}

fun main() {
    println(majorityElement(intArrayOf(3,2,3)))
    println(majorityElement(intArrayOf(2,2,1,1,1,2,2)))
}