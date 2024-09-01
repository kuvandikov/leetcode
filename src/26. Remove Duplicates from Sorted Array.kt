/*
fun removeDuplicates(nums: IntArray): Int {
    var cnt = 1
    for (i in 1..nums.lastIndex) {
        if (nums[i] != nums[i - 1]) {
            nums[cnt++] = nums[i]
        }
    }
    return cnt
}
fun main() {

    val nums = intArrayOf(0,0,1,1,1,2,2,3,3,4)
    println(removeDuplicates(nums))
    println(nums.contentToString())
}*/
