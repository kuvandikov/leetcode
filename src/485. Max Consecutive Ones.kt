fun findMaxConsecutiveOnes(nums: IntArray): Int {
    var maxConsecutiveOnes = 0
    var cnt = 0
    for (i in nums.indices) {
        if (nums[i] == 0) {
            cnt = 0
        }else{
            cnt++
        }
        maxConsecutiveOnes = maxOf(maxConsecutiveOnes, cnt)
    }
    return maxConsecutiveOnes
}
fun main() {
    println(findMaxConsecutiveOnes(nums = intArrayOf(1,1,0,1,1,1)))
}