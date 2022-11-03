package src

class Basic {

    private val greeting = "Hi"
    private var greetingVar = "Hey"

    private val number = 40

    private var notNull = "not"
    private var isNull: String? = null

    fun typeData(): Unit {
        println("greeting $greeting")

        println("greeting var $greetingVar")
        greetingVar = "Hey 2"
        println("greeting var $greetingVar")

        println("number ${number.toFloat()}")

        println(notNull)
        println(isNull?.length)
        isNull = "not null"
        println(isNull?.length)
    }

    fun typeCollections(): Unit {
        val cardNames: Array<String> = arrayOf("Jack", "Queen", "King")

        println(cardNames[0])

        cardNames[0] = "Ace"
        println(cardNames[0])

        /* Mutables */
        val cards = mutableListOf("Jack", "Queen", "King")

        cards.add("Ace") // Jack, Queen, King, Ace
        cards.remove("Jack") // Queen, King, Ace
        cards.clear() // empty list
        cards.addAll(arrayOf("Jack", "Queen", "King", "Ace")) // Jack, Queen, King, Ace

        /* Maps */
        val cardMaps = mapOf("Jack" to 11, "Queen" to 12, "King" to 13)
        val jackValue = cardMaps["Jack"]
        println(jackValue)


        for (card in cards) {
            println(card)
        }

        println("==========")
        println("maps")
        for ((name, value) in cardMaps) {
            println("$name, $value")
        }
    }

    fun structureControl(value: Int): String {
        return when(value) {
            1 -> "1"
            else -> "0"
        }
    }
}