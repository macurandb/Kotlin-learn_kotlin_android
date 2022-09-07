package com.example.examplemvvm.data.model

class QuoteProvider {

    companion object {

        fun random(): QuoteModel {
            val position: Int = (0..3).random() 
            return quote[position]
        }
        private val quote= listOf<QuoteModel>(
            QuoteModel(quote = "Ejemplo", author = "Duany"),
            QuoteModel(quote = "Ejemplo1", author = "Duany1"),
            QuoteModel(quote = "Ejemplo123", author = "Duany"),
            QuoteModel(quote = "Ejemplo2", author = "Duany2")
        )
    }
}