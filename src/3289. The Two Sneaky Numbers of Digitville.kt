fun getSneakyNumbers(nums: IntArray): IntArray {
    nums.sort()
    var index = 0
    val ans = IntArray(2)
    for (i in 1 until nums.size) {
        if (nums[i] == nums[i - 1]) {
            ans[index++] = nums[i]
        }
    }
    return ans
}

fun main() {
    getSneakyNumbers(intArrayOf(0,1,1,0)).forEach { print("$it ") }
}