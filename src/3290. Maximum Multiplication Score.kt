fun maxScore(a: IntArray, b: IntArray): Int {
    val n = b.size

    // Initialize dp table with negative infinity values
    val dp = Array(n) { IntArray(5) { Int.MIN_VALUE } }

    // Base case: If we pick 0 elements, the score is 0
    for (pos in 0 until n) {
        dp[pos][0] = 0
    }

    // DP transition
    for (pos in 0 until n) {
        for (k in 1..4) {
            if (pos > 0) {
                // If we don't pick b[pos], we take the value from the previous position
                dp[pos][k] = maxOf(dp[pos][k], dp[pos - 1][k])
            }
            // If we pick b[pos], we need to ensure the previous dp value is valid (i.e., not Int.MIN_VALUE)
            if (pos > 0 && dp[pos - 1][k - 1] != Int.MIN_VALUE) {
                dp[pos][k] = maxOf(dp[pos][k], dp[pos - 1][k - 1] + a[k - 1] * b[pos])
            }
        }
    }

    // The answer is the maximum score selecting 4 indices
    return dp[n - 1][4]
}


//fun maxScore(a: IntArray, b: IntArray): Long {
//    var ans = 0L
//    for (i in a.indices) {
//        ans += a[i] * b[i]
//    }
//    return ans
//}

fun main() {
    val a = intArrayOf(3, 2, 5, 6)
    val b = intArrayOf(2, -6, 4, -5, -3, 2, -7)

    val result = maxScore(a, b)
    println(result)
}