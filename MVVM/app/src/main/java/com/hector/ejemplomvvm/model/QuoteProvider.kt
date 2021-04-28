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
                quote = "I don’t care if it works on your machine! We are not shipping your machine!",
                author = "Vidiu Platon"
            ),
            QuoteModel(
                quote = "Measuring programming progress by lines of code is like measuring aircraft building progress by weight.",
                author = "Bill Gates"
            ),
            QuoteModel(
                quote = "My code DOESN’T work, I have no idea why. My code WORKS, I have no idea why.",
                author = "Anonymous"
            ),
            QuoteModel(
                quote = "Things aren’t always #000000 and #FFFFFF",
                author = "Anonymous"
            ),
            QuoteModel(
                quote = "Talk is cheap. Show me the code.",
                author = "Linus Torvalds"
            ),
            QuoteModel(
                quote = "Software and cathedrals are much the same — first we build them, then we pray.",
                author = "Anonymous"
            ),
            QuoteModel(quote = "¿A que esperas?, suscríbete.",
                author = "AristiDevs"
            )
        )
    }
}