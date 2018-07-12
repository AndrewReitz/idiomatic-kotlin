package _04

fun main(args: Array<String>) {
    val ui = UiElement()

    ui.setClickListener {
        println("I got clicked!")
    }









    val kui = KUiElement()
    kui.setClickListener(object: KUiElement.ClickListener {
        override fun click() {
            println("I'm clicked but I'm very verbose")
        }
    })

    kui.setLongClickListner { println("This is more like it!") }
}

class KUiElement {
    interface ClickListener {
        fun click()
    }

    fun setClickListener(listener: ClickListener) = Unit
    fun setLongClickListner(listener: () -> Unit) = Unit

    fun setTransformer(transformer: (List<Any>) -> Map<String, Set<String>>) = Unit
}

typealias Transformer = (List<Any>) -> Map<String, Set<String>>
