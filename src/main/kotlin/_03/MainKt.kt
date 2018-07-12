package _03

fun main(vararg args: String) {
    val myString = "This is a good string"
    val javaOutput = StringsUtil.spacesToHyphens(myString)
    val kotlinOutput = Strings.spacesToHyphen(myString)
    println("java: $javaOutput")
    println("kotlin: $kotlinOutput")
}
