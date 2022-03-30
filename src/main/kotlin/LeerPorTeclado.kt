fun main() {

    val num = leerNumero()
    println(num)
}

var texto: String? = null

fun leerNumero(): Int{

    texto = readLine()

    //Esto no puede hacerse ya que texto podría ser null
    //return texto.toInt()

    //Esto no nos sirve porque texto podría ser cambiado de texto
    //if(texto != null){
        //Otro hilo podría cambiar el valor de texto antes de hacer el return
        //return texto.toInt()
    //}

    //Este es factible, pero muy largo
    //texto.let {
        //if(it != null) {
            //return it.toInt()
        //}
    //}

    //Este es el ideal
    texto?.let {
        return it.toInt()
    }
    return 0
}