fun smallerNumbersThanCurrent(nums: IntArray): IntArray {
    val count = IntArray(101)

    for (num in nums) {
        count[num]++
    }

    for (i in 1..100) {
        count[i] += count[i - 1]
    }

    val ans = IntArray(nums.size)
    for (i in nums.indices) {
        if (nums[i] == 0) {
            ans[i] = 0
        } else {
            ans[i] = count[nums[i] - 1]
        }
    }

    return ans
}
fun main() {
    println(smallerNumbersThanCurrent(intArrayOf(8,1,2,2,3)).contentToString())
}