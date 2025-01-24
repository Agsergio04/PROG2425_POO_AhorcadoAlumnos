package es.iesra.prog2425_ahorcado

class Jugador(
    var intentos: Int,
    private val letrasUsadas: MutableSet<Char> = mutableSetOf()
) {
    init {
        //comprobante
    }
    fun intentarLetra(letra: Char): Boolean {
        if (letra !in letrasUsadas){
            letrasUsadas.add(letra)
            return true
        } else{
            return false
        }
    }

    fun fallarIntento(){
        intentos -= 1
    }

    fun obtenerLetrasUsadas(): String{
        var palabrasRetornar = ""

        for (letras in letrasUsadas){
            palabrasRetornar += "$letras "
        }

        return palabrasRetornar
    }

}