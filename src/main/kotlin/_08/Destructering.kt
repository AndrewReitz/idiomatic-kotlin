package _08

fun main(args: Array<String>) {
    val pair = 1 to "Three"

    pair.let { (one, three) -> println("$one $three") }


    val person = Person("Rick", "Sanchez", 70)

    val (firstName, lastName, age) = person
    println("firstName: $firstName")

    val (firstNameAgain) = person
    println(firstNameAgain)


    val (_, last) = person
    println("lastName: $last")

    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8)
    val (_, _, three) = list
    println(three)
}

data class Person(
    val firstName: String,
    val lastName: String,
    val age: Int
)
