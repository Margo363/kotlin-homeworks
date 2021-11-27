fun commissionPay (
    cardType: String = "VkPay",
    limitInMonthVkPay: Int = 0,
    amount: Int = 1
): Int {
    val noCommission = amount * 0
    val limitInDayVkPay = 1_500_000 //максимальная сумма перевода в копейках за раз Vk Pay
    val limitInMonthVkPayMax = 4_000_000

    when(cardType=="VkPay") {
        amount <= limitInDayVkPay -> println("комиссия с перевода составила $noCommission рублей")
        limitInMonthVkPay > limitInMonthVkPayMax -> println("Внимание! Перевод недоступен, максимальная сумма всех переводов в месяц = 40000 рублей.")
        else -> println("Внимание! Перевод недоступен, максимальная сумма единовременного перевода = 15000 рублей.")
    }
    return noCommission
}

fun main() {
    val amount = 1_500_008 //сумма перевода в копейках
    val limitInMonthVkPay = 0
    val cardType = "VkPay"

    val result = commissionPay(cardType, limitInMonthVkPay, amount)
}


/////////////
//val amount = 6_000_000 //сумма перевода в копейках
//val limitInDayVkPay = 1_500_000 //максимальная сумма перевода в копейках в день Vk Pay
//val limitInMonthVkPay = 4_000_000 //максимальная сумма перевода в копейках в месяц Vk Pay
//val commissionVkPay = amount * 0 // комиссия 0% от суммы перевода
//val cardVkPay = amount + commissionVkPay

        //val percentageCommission = amount / 10000 * 75 //комиссия 0.75% от суммы перевода
        //val commissionMin = 3500 //комиссия минимум 35 рублей = 3500 коп

        //var commission = percentageCommission
        //if (commission < commissionMin) {
        //    commission = commissionMin
    //}
    //println("commission: $commission")

//}

//val limitInDay = 15_000_000 //максимальная сумма перевода в копейках в день s
//val limitInDaySending = 15_000_000 //максимальная сумма перевода в копейках в день ОТПРАВЛЕНИЕ
//val limitInMonth = 60_000_000 //максимальная сумма перевода в копейках в месяц
//val limitInMonthReceiving = 60_000_000 //максимальная сумма перевода в копейках в месяц ПОЛУЧЕНИЕ
//
//
//
//val notComission = mastercardAmount * 0 // комиссия 0% от суммы перевода mastercard до 7_500_000
//val minComission = 2_000 // минмальная комиссия 20 рублей = 2000 коп
//val percentageCommission = amount / 1_000 * 6 //комиссия 0.6% от суммы перевода mastercard

//if (amount 0..75_000) {
//    mastercardAmount + mastercardNotComission
//} else if (75_001..15_000_000) {
//    mastercardAmount + mastercardPercentageCommission + mastercardMinComission
//} else { println("Внимание! Перевод недоступен, лимит перевода в сутки 150000 рублей.")
//}









