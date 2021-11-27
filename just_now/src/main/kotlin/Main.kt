fun main() {
    var secondsAgo = 86400
    val agoToText = secondsAgo

    var minutes = secondsAgo / 60
    val minutesEleven = 11
    val minutesLastOne = 1
    val minutesLastTwo = 2
    val minutesLastThree = 3
    val minutesLastFore = 4

    val lastTwoDigitsMinutes = minutes % 100
    val lastDigitMinutes = minutes % 10

    var hours = secondsAgo / 3600
    val hoursEleven = 11
    val hoursLastOne = 1
    val hoursLastTwo = 2
    val hoursLastThree = 3
    val hoursLastFore = 4

    val lastTwoDigitsHours = hours % 100
    val lastDigitHours = hours % 10

    if (secondsAgo in 0..59) {
        println("был(а) в сети только что")

    } else if (secondsAgo in 60..3599) {

        var result = if (lastTwoDigitsMinutes === minutesEleven) {
            println("был(а) в сети $minutes минут назад")
        } else if (lastDigitMinutes === minutesLastOne) {
            println("был(а) в сети $minutes минуту назад")
        } else if (lastDigitMinutes === minutesLastTwo) {
            println("был(а) в сети $minutes минуты назад")
        } else if (lastDigitMinutes === minutesLastThree) {
            println("был(а) в сети $minutes минуты назад")
        } else if (lastDigitMinutes === minutesLastFore) {
            println("был(а) в сети $minutes минуты назад")
        } else {
            println("был(а) в сети $minutes минут назад")
        }

    } else if (secondsAgo in 3600..86399) {
        var result = if (lastTwoDigitsHours === hoursEleven) {
            println("был(а) в сети $hours часов назад")
        } else if (lastDigitHours === hoursLastOne) {
            println("был(а) в сети $hours час назад")
        } else if (lastDigitHours === hoursLastTwo) {
            println("был(а) в сети $hours часа назад")
        } else if (lastDigitHours === hoursLastThree) {
            println("был(а) в сети $hours часа назад")
        } else if (lastDigitHours === hoursLastFore) {
            println("был(а) в сети $hours часа назад")
        } else {
            println("был(а) в сети $hours часов назад")
        }

    } else if (secondsAgo in 86400..172799) {
        println("был(а) в сети вчера")
    } else {
        println("был(а) в сети давно")
    }

}

//        when (secondsAgo) {
//            in 1..60 -> println("был(а) в сети только что")
//            in 61..3600 -> println("был(а) в сети х минут назад")
//            in 3601..86_400 -> println("был(а) в сети х часов назад")
//            in 86_401..172_800 -> println("был(а) в сети вчера")
//            else -> println("был(а) в сети давно")
//        }


