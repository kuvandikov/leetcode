package weekly_contest_452


fun checkEqualPartitions(nums: IntArray, target: Long): Boolean {
    val n = nums.size
    val totalSubsets = 1 shl n

    for (mask in 1 until totalSubsets - 1) {
        var prod1 = 1L
        var valid1 = true
        val used = BooleanArray(n)

        for (i in 0 until n) {
            if ((mask and (1 shl i)) != 0) {
                prod1 *= nums[i]
                if (prod1 > target) {
                    valid1 = false
                    break
                }
                used[i] = true
            }
        }

        if (!valid1 || prod1 != target) continue

        var prod2 = 1L
        var valid2 = false
        for (i in 0 until n) {
            if (!used[i]) {
                prod2 *= nums[i]
                if (prod2 > target) {
                    valid2 = false
                    break
                }
                valid2 = true
            }
        }

        if (valid2 && prod2 == target) return true
    }

    return false
}

fun main() {
    val ans = checkEqualPartitions(
        intArrayOf(2,5,3,7),
        15
    )
    println(ans)
}


