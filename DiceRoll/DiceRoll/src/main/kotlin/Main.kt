fun main() {

    val dice = Dice(6)
    val rollResults = dice.roll()
    val luckyNumber = 4

    when (rollResults) {
        luckyNumber -> println("Congrats!")
        1 -> println("Please roll again")
        2 -> println("Please keep trying")
        3 -> println("Keep going, you got this!")
        5 -> println("Not quite!")
        else -> println("Unlucky!")
    }
}
    class Dice(val numSides: Int) {
        fun roll(): Int {
            return (1..numSides).random()
        }
    }



