class GeneradorSecuencias(private val consola: Consola) {
    private lateinit var sec: Sequence<String>

    private fun lineSequence(limit: Int = Int.MAX_VALUE) = generateSequence { readln() }.constrainOnce().take(limit)

    fun fraseIncremental(num: Int) {
        sec = lineSequence(num)
        var frase = ""

        for (palabra in sec) {
            frase += palabra
            consola.salidaDatos(frase)
        }
    }

    fun fraseFinal(num: Int) {
        sec = lineSequence(num)
        var frase = ""

        for (palabra in sec) {
            frase += palabra
        }
        consola.salidaDatos(frase)
    }

    private fun getSec(): String {
        return sec.toList().joinToString { " " }
    }

    fun mostrarSec() {
        consola.salidaDatos(getSec(), false)
    }

}