class Consola: IEntradaSalida {

    override fun leerNumero(msj: String): Int? {
        salidaDatos(msj, false)
        return readlnOrNull()?.toInt()
    }

    override fun salidaDatos(msj: String, salto: Boolean) {
        if (salto) {
            println(msj)
        } else {
            print(msj)
        }
    }
}