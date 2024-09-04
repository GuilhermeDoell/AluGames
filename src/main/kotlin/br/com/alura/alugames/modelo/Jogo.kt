package org.example.br.com.alura.alugames.modelo

import br.com.alura.alugames.modelo.Recomendavel
import com.google.gson.annotations.Expose
import javax.persistence.*

data class Jogo(@Expose val titulo:String,
                @Expose val capa:String): Recomendavel {
    var descricao:String? = null
    var preco = 0.0

    var id = 0
    private val listaNotas = mutableListOf<Int>()

    override val media: Double
        get() = listaNotas.average()

    override fun recomendar(nota: Int) {
        listaNotas.add(nota)
    }

    constructor(titulo: String, capa: String, preco: Double, descricao: String?, id:Int = 0):
            this(titulo, capa) {
        this.preco = preco
        this.descricao = descricao
        this.id = id
    }

    override fun toString(): String {
        return "\nTítulo: $titulo \n" +
                "Capa: $capa \n" +
                "Descricao: $descricao \n" +
                "Preço: R$ $preco\n" +
                "Reputação: $media\n" +
                "Id: $id"
    }

}