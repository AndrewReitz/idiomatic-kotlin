package _07

// https://github.com/JetBrains/kotlin/blob/master/libraries/stdlib/src/kotlin/util/Standard.kt

fun main(args: Array<String>) {
}

fun `with run`() {
    println("here")
    run {
        println("there")
    }

    // equivalent to
    val c = { println("there") }()


    run {
        if (firstRun) FirstRunDialog() else Dialog()
    }.show()
}

fun `with "with" and run`() {
    val foo = "hello".run { plus(" run") }
    val bar = with("hello") { plus(" with") }
    println(foo)
    println(bar)

    val baz = with(StringBuilder()) {
        append("Hello")
        append(" ")
        append("World")
        append("!")
        toString() // baz will be "Hello World!"
    }
}

fun `with let`() {
    val original: String = "original text"

    val length = original.let { text -> text.substringAfter(delimiter = " ") }
        .let { text -> text.length }
}

fun `with also`() {
    val original: String = "original text"

    val length = original.substringAfter(delimiter = " ")
        .length
        .also { println("length is $it") }
}

fun `with apply`() {
    val textView = TextView().apply {
        text = "Hi Gr8Config"
        backgroundColor = 0xff00ff
    }
}


val firstRun: Boolean = false

open class Dialog {
    fun show() = Unit
}

class FirstRunDialog: Dialog()

class TextView {
    var text: String = ""
    var backgroundColor: Int = 0
}

data class Options(var user: String = "", var password: String = "") {
    fun build() : Options = this
}
object MyApp {
    val name = ""
    fun execute() = Unit
    fun instance(): MyApp? = null
    fun init(options: Options) = MyApp
}