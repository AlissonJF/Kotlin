fun main() {
    var lado = Moeda(2)
    var ladoSorteado = lado.jogar()
    var CaraCoroa = ""
    if (ladoSorteado == 1) {
        CaraCoroa = "cara"
    } else {
        CaraCoroa = "coroa"
    }
    println("Sua moeda caiu em ${CaraCoroa}")
}

class Moeda(var lados: Int) {
    
    fun jogar(): Int {
        var intervalo = 1..2
        var ladoSorteado = intervalo.random()
        return ladoSorteado
    }
}
