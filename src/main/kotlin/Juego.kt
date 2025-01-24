package es.iesra.prog2425_ahorcado

class Juego(
    val palabra : String = "hola",
    val jugador : Jugador) {

    fun iniciar(){
        println("¡Bienvenido al juego del Ahorcado!")
        println("La palabra tiene ${palabra.count()} letras. ") //palabra.palabraOculta.lenght


        do {
            println("Palabra: ${'_'}") // palabraOculta
            println("Intentos restantes: ${jugador.intentos}")
            println("Letras usadas: ${jugador.obtenerLetrasUsadas()}")

            if (true){

            }else jugador.fallarIntento()

        }while (palabraDescubrir == palabra)//progreso == palabraOculta

        if (palabraDescubrir == palabra) { // palabra.esCompleta()
            println("\n¡Felicidades! Has adivinado la palabra: ${palabra}") // palabra.obtenerProgreso()
        } else {
            println("\nLo siento, te has quedado sin intentos. La palabra era: ${palabra.palabraOculta}")
        }
    }

    fun preguntar(msj: String): Boolean {
        do {
            print("$msj (s/n): ")
            val respuesta = readln().trim().lowercase()
            when (respuesta) {
                "s" -> return true
                "n" -> return false
                else -> println("Respuesta no válida! Inténtelo de nuevo...")
            }
        } while (true)
    }
}