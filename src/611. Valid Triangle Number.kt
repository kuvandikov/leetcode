/**
a + b > c, a + c > b, b + c > a

 fun triangleNumber(nums: IntArray): Int {
    var cnt = 0
    for (i in 0..nums.size-3) {
        for (j in i + 1..nums.size-2) {
            for (k in j+1..nums.size-1) {
                if (nums[i] + nums[j] > nums[k] && nums[i] + nums[k] > nums[j] && nums[j] + nums[k] > nums[i]){
                    cnt++
                }
            }
        }
    }

    return cnt
}*/

/**
 * Since it is sorted, it is enough to check only a+b>c, a <= b <= c
 *
 * */
fun triangleNumber(nums: IntArray): Int {
    nums.sort()
    var cnt = 0

    for (i in nums.size - 1 downTo 2) {
        var l = 0
        var r = i - 1
        while (l < r) {
            if (nums[l] + nums[r] > nums[i]) {
                cnt += r - l
                r--
            }else{
                l++
            }
        }
    }

    return cnt
}
fun main() {
    val ans = triangleNumber(
        intArrayOf(1,2,3,4,5,6)
    )
    println(ans)
}

class Solution {

    fun triangleNumber(nums: IntArray): Int {
        nums.sort()
        var cnt = 0

        for (i in nums.size - 1 downTo 2) {
            var l = 0
            var r = i - 1
            while (l < r) {
                if (nums[l] + nums[r] > nums[i]) {
                    cnt += r - l
                    r--
                } else {
                    l++
                }
            }
        }

        return cnt
    }
}