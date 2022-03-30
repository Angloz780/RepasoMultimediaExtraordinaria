fun main(){

    val num = readLine()

    when(num){
        "0" -> println("Carácter 0")
        "1" -> println("Carácter 1")
        null -> println("Carácter 0")
    }

    num?.let { texto ->

        when{
            texto == "0" -> println("Carácter 0")
            texto == "1" -> println("Carácter 1")
            texto.contains("2") -> println("Contiene el Carácter 2")
        }
    }
}