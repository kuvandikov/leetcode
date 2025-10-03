fun maxBottlesDrunk(numBottles: Int, numExchange: Int): Int {
    var ans = numBottles
    var emptyBottles = numBottles
    var mNumExchange = numExchange

    while(emptyBottles >= mNumExchange){
        emptyBottles = emptyBottles - mNumExchange + 1
        ans++
        mNumExchange++
    }

    return ans
}

fun main() {
    val ans = maxBottlesDrunk(
        numBottles = 10, numExchange = 3
    )
    println(ans)
}