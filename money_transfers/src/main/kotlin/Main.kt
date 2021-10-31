fun main() {
    val amount = 6_000_000 //сумма перевода в копейках
    val percentageCommission = amount / 10000 * 75 //комиссия 0.75% от суммы перевода
    val commissionMin = 3500 //комиссия минимум 35 рублей = 3500 коп

    var commission = percentageCommission
    if (commission < commissionMin) {
        commission = commissionMin
    }
    println("commission: $commission")
}
