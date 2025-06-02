fun candy(ratings: IntArray): Int {
    val arr = IntArray(ratings.size) { 1 }

    for (i in 1 until ratings.size) {
        if (ratings[i - 1] < ratings[i]) {
            arr[i] = arr[i - 1] + 1
        }
    }

    for (i in ratings.size - 2 downTo 0) {
        if (ratings[i] > ratings[i + 1]) {
            arr[i] = maxOf(arr[i], arr[i + 1] + 1)
        }
    }

    return arr.sum()
}

fun main() {
    println(
        candy(
            intArrayOf(1,2,2)
        )
    ) // Output: 5
}