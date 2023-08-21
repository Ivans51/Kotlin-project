import src.Basic

fun main(args: Array<String>) {
    basic()
}

private fun basic() {
    val basic = Basic()
    basic.typeData()
    basic.typeCollections()
    println(basic.structureControl(1))

    println("Hello, world!")
    println("It's a sunny and warm day!")
}