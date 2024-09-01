
fun removeDuplicates(nums: IntArray): Int {
    val m = mutableMapOf<Int, Int>()
    var cnt = 0
    for (i in nums.indices) {
        if (m.containsKey(nums[i]))
            m[nums[i]] = m[nums[i]]!! + 1
        else
            m[nums[i]] = 1

        if ((m[nums[i]] ?: 0) < 3) {
            nums[cnt++] = nums[i]
        }
    }

    return cnt
}
fun main() {
    val nums = intArrayOf(1,1,1,2,2,3)
    println(removeDuplicates(nums))
    println(nums.contentToString())
}