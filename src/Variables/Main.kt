package Variables

fun main(args: Array<String>) {
    val userJava = UserJava("test@mail.com")
    println("Java example: ${userJava.email}")

    val userKotlin = UserKotlin("test@mail.com")
    println("Kotlin example: ${userKotlin.email}")


    var name: String = "abc"
    val name2: String
}