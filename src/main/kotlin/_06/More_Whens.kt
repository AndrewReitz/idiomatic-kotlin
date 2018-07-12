package _06

fun Int?.asString() = if (this == null) "null"
else if (this == 0) "0"
else if (this == 1) "1"
else if (this == 2) "2"
else "Unknown"


// scroll 👇






























fun Int?.betterAsString() = when(this) {
    0 -> "0"
    1 -> "1"
    2 -> "2"
    3, 4 -> "Some others" // no fall through!
    else -> "Unknown"
}

// scroll 👇


















sealed class Thing
object CatInTheHat: Thing()
data class Thing1(val name: String): Thing()
data class Thing2(val name: String, val age: Int): Thing()


fun main(args: Array<String>) {
    println(getName(CatInTheHat))
}


private fun getName(thing: Thing) = when(thing) {
    CatInTheHat -> "Cat in the Hat"
    is Thing1 -> thing.name // Smart Cast 👍
    is Thing2 -> "${thing.name} ${thing.age}"
}
