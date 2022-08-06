import basic.Calculator
import lotto.LottoStore

fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    val lottoStore = LottoStore()
    val calculator = Calculator()

//    lottoStore.open();
    println(calculator.sum(10, 20))
}
