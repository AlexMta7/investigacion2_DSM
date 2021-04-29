package com.hector.ejemplomvvm.model


// En esta clase tenemos una funcion random para los datos que tenemos en la lista y nos retorne una cita random

class QuoteProvider {
    companion object {

        fun random(): QuoteModel {
            val position = (0..10).random()
            return quotes[position]
        }

        private val quotes = listOf(
            QuoteModel(
                quote = "No es un error, es una característica no documentada",
                author = "Anónimo"
            ),
            QuoteModel(
                quote = "“Software Developer” - Un organismo que convierte la cafeína en software",
                author = "Anónimo"
            ),
            QuoteModel(
                quote = "Si la depuración es el proceso de eliminar los errores del software, la programación debe ser el proceso de ponerlos",
                author = "Edsger Dijkstra"
            ),
            QuoteModel(
                quote = "Una interfaz de usuario es como un chiste. Si tienes que explicarla, no es tan buena.",
                author = "Anónimo"
            ),
            QuoteModel(
                quote = "¡No me importa si funciona en su máquina! ¡No vamos a enviar su máquina!",
                author = "Vidiu Platon"
            ),
            QuoteModel(
                quote = "Medir el progreso de la programación por líneas de código es como medir el progreso de la construcción de aviones por su peso.",
                author = "Bill Gates"
            ),
            QuoteModel(
                quote = "Mi código NO funciona, no tengo ni idea de por qué. Mi código FUNCIONA, no tengo ni idea de por qué.",
                author = "Anónimo"
            ),
            QuoteModel(
                quote = "Las cosas no son siempre #000000 y #FFFFFF",
                author = "Anónimo"
            ),
            QuoteModel(
                quote = "Hablar es barato. Muéstrame el código.",
                author = "Linus Torvalds"
            ),
            QuoteModel(
                quote = "Los programas informáticos y las catedrales son muy parecidos: primero los construimos y luego rezamos.",
                author = "Anónimo"
            ),
            QuoteModel(quote = "Mi GitHub @hector-manny.",
                author = "Hector Martinez"
            )
        )
    }
}