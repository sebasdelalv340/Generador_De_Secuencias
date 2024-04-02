class Consola: IEntradaSalida {

    override fun leerNumero(msj: String): Int? {
        println("Introduce el número de palabras:")
        val num = readlnOrNull()?.toIntOrNull()
        if (num != null) {
            return num
        } else {
            println("El número introducido no es válido")
            return num
        }
    }

    override fun salidaDatos(msj: String, salto: Boolean) {
        if (salto) {
            println(msj)
        } else {
            print(msj)
        }
    }
}