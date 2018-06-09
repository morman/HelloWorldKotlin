fun main(args: Array<String>) {
    println("Hello World!")
    // decisions, decisions
    var x = 2
    when(x) {
        1 -> print("x is 1")
        2 -> print("x is 2")
        else -> {
            print ("Were not quite sure what to do with x...")
        }
    }
}