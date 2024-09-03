fun canJump(nums: IntArray): Boolean {
    var maxJump = 0
    // [0,2,3]
    for (i in 0 until nums.size - 1) {

        maxJump = Math.max(maxJump, i + nums[i])

        if (nums[i] == 0 && maxJump <= i) {
            return false
        }
    }

    return true
}

fun main() {
    val nums = intArrayOf(3,2,1,0,4)
    println(canJump(nums))

}