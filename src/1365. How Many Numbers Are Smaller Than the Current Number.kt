fun smallerNumbersThanCurrent(nums: IntArray): IntArray {
    val ans = IntArray(nums.size)
    for (i in nums.indices) {
        var cnt = 0
        for (j in nums.indices) {
            if (i != j && nums[i]>nums[j]) {
                cnt++
            }
        }
        ans[i] = cnt
    }
    return ans
}
fun main() {
    println(smallerNumbersThanCurrent(intArrayOf(8,1,2,2,3)).contentToString())
}