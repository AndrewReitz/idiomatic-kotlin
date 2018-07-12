package _02

import kotlin.reflect.KProperty

class MyCoolClass {
    private var phrase: String = "That's the way the news goes"

    fun getPhrase() = phrase

    fun setPhrase(phrase: String) {
        println("setting $phrase")
        this.phrase = phrase
    }
}





// note to self -> scroll down




















private var _os: String? = null
val os: String
    get() {
        if (_os == null) {
            println("getting os info...")
            _os = "${System.getProperty("os.name")} v${System.getProperty("os.version")} (${System.getProperty("os.arch")})"
        }
        return _os!!
    }


fun main(args: Array<String>) {
    for(i in 1..3) {
        println(os)
    }
}















class AnotherClass {
    var a: String = "init"
        get() {
            println("getting a")
            return a
        }
    set(value) {
        println("setting a to $value")
        field = value
    }
}

class BetterClass {
    var a by PropertyLogger("Initial Value")
}

class PropertyLogger(var field: String) {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        println("You read me")
        return field
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("$thisRef is having $value set")
        field = value
    }
}








class PlumbusListAdapter(var list: MutableList<String>)



class ButterPlumbusListAdapter(list: List<String>) {
    val list = list.toMutableList()
}










