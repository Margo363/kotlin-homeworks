fun main() {
    val secondsAgo = 2680

    val minutes = secondsAgo / 60
    val minutesEleven = 11
    val minutesLastOne = 1
    val minutesLastTwo = 2
    val minutesLastThree = 3
    val minutesLastFore = 4

    val lastTwoDigitsMinutes = minutes % 100
    val lastDigitMinutes = minutes % 10

    val hours = secondsAgo / 3600
    val hoursEleven = 11
    val hoursLastOne = 1
    val hoursLastTwo = 2
    val hoursLastThree = 3
    val hoursLastFore = 4

    val lastTwoDigitsHours = hours % 100
    val lastDigitHours = hours % 10

    when (secondsAgo){
        in 0..59 -> println("был(а) в сети только что")
        in 60..3599 ->
            when(true) {
                lastTwoDigitsMinutes == minutesEleven -> println("был(а) в сети $minutes минут назад")
                lastDigitMinutes == minutesLastOne -> println("был(а) в сети $minutes минуту назад")
                lastDigitMinutes == minutesLastTwo||lastDigitMinutes == minutesLastThree||lastDigitMinutes == minutesLastFore -> println("был(а) в сети $minutes минуты назад")
                else -> println("был(а) в сети $minutes минут назад")
            }

        in 3600..86399 ->
            when(true){
                lastTwoDigitsHours == hoursEleven -> println("был(а) в сети $hours часов назад")
                lastDigitHours == hoursLastOne -> println("был(а) в сети $hours час назад")
                lastDigitHours == hoursLastTwo||lastDigitHours == hoursLastThree||lastDigitHours == hoursLastFore -> println("был(а) в сети $hours часа назад")
                else -> println("был(а) в сети $hours часов назад")
            }

        in 86400..172799 -> println("был(а) в сети вчера")
        else -> println("был(а) в сети давно")
    }

}