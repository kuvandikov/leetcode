fun generateParenthesis(n: Int): List<String> {
    val dp = Array(n + 1) { mutableListOf<String>() }
    dp[0].add("")

    for (k in 1..n){
        for (i in 0 until k){
            val j = k - 1 - i
            for (s1 in dp[i]){
                for (s2 in dp[j]){
                    dp[k].add("($s1)$s2")
                }
            }
        }
    }
    return dp[n]
}

fun main() {
    val n = 3
    println(generateParenthesis(n))
}