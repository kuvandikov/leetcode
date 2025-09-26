import kotlin.math.min

fun minimumTotal(triangle: List<List<Int>>): Int {
    val n = triangle.size
    val dp = IntArray(n)

    for (j in 0 until n) {
        dp[j] = triangle[n - 1][j]
    }

    for (i in n - 2 downTo 0) {
        for (j in 0..i) {
            dp[j] = minOf(dp[j], dp[j + 1]) + triangle[i][j]
        }
    }

    return dp[0]
}

fun main() {
    val ans = minimumTotal(
        listOf(
            listOf(2),
            listOf(3, 4),
            listOf(6, 5, 7),
            listOf(4, 1, 8, 3)
        )
    )

    println(ans)
}