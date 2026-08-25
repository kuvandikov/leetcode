fun evalRPN(tokens: Array<String>): Int {
    val stack = ArrayDeque<Int>()

    for (token in tokens) {
        when (token) {
            "+" -> {
                val b = stack.removeLast()
                val a = stack.removeLast()
                stack.addLast(a + b)
            }

            "-" -> {
                val b = stack.removeLast()
                val a = stack.removeLast()
                stack.addLast(a - b)
            }

            "*" -> {
                val b = stack.removeLast()
                val a = stack.removeLast()
                stack.addLast(a * b)
            }

            "/" -> {
                val b = stack.removeLast()
                val a = stack.removeLast()
                stack.addLast(a / b)
            }

            else -> {
                stack.addLast(token.toInt())
            }
        }
    }

    return stack.removeLast()
}

fun main() {
    println(evalRPN(arrayOf("4", "13", "5", "/", "+")))
}