fun largestRectangleArea(heights: IntArray): Int {
    val stack = ArrayDeque<Int>()
    var maxArea = 0
    val n = heights.size

    for (i in 0..n){
        val currentHeight = if (i == n) 0 else heights[i]
        while (stack.isNotEmpty() && currentHeight < heights[stack.last()]){
            val h = heights[stack.removeLast()]
            val w = if (stack.isEmpty()) i else i - stack.last() - 1
            maxArea = maxArea.coerceAtLeast(h * w)
        }
        stack.addLast(i)
    }
    return maxArea
}
fun main() {
    println(largestRectangleArea(intArrayOf(2,4)))
}