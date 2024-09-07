fun hIndex(citations: IntArray): Int {
    citations.sort()
    for (i in citations.indices) {
        if (citations[i] >= citations.size -i) {
            return citations.size - i
        }
    }
    return 0
}

fun main() {
    val citations = intArrayOf(1,3,1)
    println(hIndex(citations))
}