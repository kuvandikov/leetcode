fun intToRoman(num: Int): String {
    var number = num
    var roman = ""
    when(number/1000){
        3-> roman = "MMM"
        2-> roman = "MM"
        1-> roman = "M"
    }
    number %= 1000
    when(number/100){
        9-> roman = roman.plus("CM")
        8-> roman = roman.plus("DCCC")
        7-> roman = roman.plus("DCC")
        6-> roman = roman.plus("DC")
        5-> roman = roman.plus("D")
        4-> roman = roman.plus("CD")
        3-> roman = roman.plus("CCC")
        2-> roman = roman.plus("CC")
        1-> roman = roman.plus("C")
    }
    number %= 100

    when(number/10){
        9-> roman = roman.plus("XC")
        8-> roman = roman.plus("LXXX")
        7-> roman = roman.plus("LXX")
        6-> roman = roman.plus("LX")
        5-> roman = roman.plus("L")
        4-> roman = roman.plus("XL")
        3-> roman = roman.plus("XXX")
        2-> roman = roman.plus("XX")
        1-> roman = roman.plus("X")
    }
    number %= 10

    when(number){
        9-> roman = roman.plus("IX")
        8-> roman = roman.plus("VIII")
        7-> roman = roman.plus("VII")
        6-> roman = roman.plus("VI")
        5-> roman = roman.plus("V")
        4-> roman = roman.plus("IV")
        3-> roman = roman.plus("III")
        2-> roman = roman.plus("II")
        1-> roman = roman.plus("I")
    }


   return roman
}

fun main() {
    val num = 3749
    println(intToRoman(num))
}