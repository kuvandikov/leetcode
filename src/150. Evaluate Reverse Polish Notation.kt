fun evalRPN(tokens: Array<String>): Int {
    val stack = ArrayDeque<Int>()

    for (token in tokens) {
        if (token in "+-*/") {
            val b = stack.removeLast()
            val a = stack.removeLast()
            val res = when (token) {
                "+" -> a + b
                "-" -> a - b
                "*" -> a * b
                else -> a / b
            }
            stack.addLast(res)
        } else {
            stack.addLast(token.toInt())
        }
    }

    return stack.last()
}

fun main() {
    println(evalRPN(arrayOf("4", "13", "5", "/", "+")))
}