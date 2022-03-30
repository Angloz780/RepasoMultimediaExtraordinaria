fun main() {

    val a : Int? = 3
    val b = a?: 0
    println(b)

    val textoPosiblementeNulo = readLine()
    var texto = textoPosiblementeNulo?: " "
}