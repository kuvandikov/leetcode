fun romanToInt(s: String): Int {
    var sum = 0
    val m = mapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )

    if (s.length == 1) return m[s[0]]!!

    for(i in 0..s.length - 2){
        if(m[s[i]]!! >= m[s[i+1]]!!){
            sum += m[s[i]]!!
        }else{
            sum -= m[s[i]]!!
        }
    }

    return sum + m[s[s.length-1]]!!
}

fun main() {

    println(romanToInt("III"))
    println(romanToInt("LVIII"))
    println(romanToInt("MCMXCIV"))

}