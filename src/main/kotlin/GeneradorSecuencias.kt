class GeneradorSecuencias(var sec: MutableList<Int>) {

    fun lineSequence(limit: Int = Int.MAX_VALUE) = generateSequence { readln().constrainOnce().take(limit) }

    fun fraseIncremental() {}

    fun fraseFinal() {}

    fun getSec() {}

    fun mostrarSec() {}

}