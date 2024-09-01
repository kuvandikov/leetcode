fun removeElement(nums: IntArray, `val`: Int): Int {
    var cnt = 0
    for (i in nums.indices) {
        if (nums[i] != `val`) {
            nums[cnt] = nums[i]
            cnt++
        }
    }
    return cnt
}


fun main() {

    val nums = intArrayOf(0,1,2,2,3,0,4,2)
    val `val` = 2

    println(removeElement(nums, `val`))
    println(nums.contentToString())
}