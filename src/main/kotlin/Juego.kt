package es.iesra.prog2425_ahorcado

class Juego(
    val palabra : Palabra,
    val jugador : Jugador) {

    fun iniciar(){
        println("¡Bienvenido al juego del Ahorcado!")
        println("La palabra tiene ${palabra.palabraOculta.length} letras. ")


        do {
            println("Palabra: ${palabra.obtenerProgreso()}") // palabraOculta
            println("Intentos restantes: ${jugador.intentos}")
            println("Letras usadas: ${jugador.obtenerLetrasUsadas()}")

            var palabraUsuario  = readln()
            val letra = palabraUsuario[0]


            if(jugador.intentarLetra(letra)){
                if (!(palabra.revelarLetra(letra)))
                    jugador.fallarIntento()

            }else{
                println("Introduce otra letra porque esa ya la has usado")
            }


        }while (jugador.intentos > 0 && !(palabra.esCompleta()))

        if (palabra.esCompleta()) { //
            println("\n¡Felicidades! Has adivinado la palabra: ${palabra.obtenerProgreso()}")
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
