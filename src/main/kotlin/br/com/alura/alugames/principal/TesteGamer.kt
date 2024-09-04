import br.com.alura.alugames.modelo.Gamer

fun main() {
    val gamer1 = Gamer("guilherme", "guilherme@teste.com")
    println(gamer1)

    val gamer2 = Gamer(
        "Mari",
        "teste@teste.com",
        "01/01/1900",
        "mari")

    println(gamer2)

    gamer1.let {
        it.dataNascimento = "01/01/1994"
        it.usuario = "gui"
    }.also {
        println(gamer1.idInterno)
    }

    println(gamer1)
    gamer1.usuario = "Joao"
    println(gamer1)
}