fun minimumPushes(word: String): Int {
    var ans = 0
    for (i in 0 until word.length) {
        ans += i / 8 + 1
    }
    return ans
}

fun main() {
    println(minimumPushes(readln()))
}