class GeneradorSecuencias(private val consola: Consola) {
    lateinit var sec: Sequence<String>

    private fun lineSequence(limit: Int = Int.MAX_VALUE) = generateSequence { readln() }.constrainOnce().take(limit)

    fun fraseIncremental(num: Int) {
        sec = lineSequence(num)
        var frase = ""

        for (palabra in sec) {
            frase += palabra
        }
    }

    fun fraseFinal() {}

    fun getSec() {}

    fun mostrarSec() {}

}