package es.iesra.prog2425_ahorcado

class Jugador(intentosMaximos: Int) {

    private var intentos: Int = intentosMaximos
    private var letrasUsadas: MutableSet<Char>()

    fun intentarLetra(letra: Char): Boolean{
        return if (letra !in letrasUsadas) {
            letrasUsadas.add(letra)
            true
        } else {
            false
        }
    }

    fun fallarIntento() {
        if (intentos > 0){
            intentos--
        }
    }

    fun obtenerLetrasUsadas(): String {
        return letrasUsadas.joinToString(" ")
    }
}
