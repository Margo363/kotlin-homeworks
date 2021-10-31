fun main() {
    val likes = 23456711
    val people = "человеку"
    val human = "людям"
    val lastTwoDigits = likes%100
    val lastDigit = likes%10
    val one = 1
    val eleven = 11

    var result = if (lastTwoDigits === eleven) {
        println ("понравилось: $likes $human")
    } else if (lastDigit === one) {
        println ("понравилось: $likes $people")
    } else {
        println ("понравилось: $likes $human")
    }
}

