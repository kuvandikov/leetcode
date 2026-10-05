/*fun scoreOfParentheses(s: String): Int {
    val stack = mutableListOf(0)

    for (char in s) {
        if (char == '(') {
            stack.add(0)
        } else {
            val v = stack.removeLast()
            val top = stack.removeLast()
            stack.add(top + maxOf(2 * v, 1))
        }
    }

    return stack.removeLast()
}*/

fun scoreOfParentheses(s: String): Int {
    if (s.isEmpty()) return 0

    var cnt = 0
    for (i in s.indices) {
        if (s[i] == '(') cnt++ else cnt--

        if (cnt == 0) {
            return if (i == 1) {
                1 + scoreOfParentheses(s.substring(2))
            } else {
                2 * scoreOfParentheses (s.substring(1, i)) + scoreOfParentheses(s.substring(i + 1))
            }
        }
    }

    return 0
}

fun main() {
    val s = "(())()"
    println(scoreOfParentheses(s))
}
