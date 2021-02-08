class Main

fun main(args: Array<String>) {

    println("\nmain() worked")
    sepLn()

    //инициализация Dog
    val myDog = Dog("Rex", 21, "Mixed breed")
    println("${myDog.name} ${myDog.weight} ${myDog.breed}")

}

//just separate line
fun sepLn() {
    println("-----")
}
