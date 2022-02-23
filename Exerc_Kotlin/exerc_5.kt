fun main() {
    val meuDado = Dado(6)
    val numeroSorteado = meuDado.rolar()
    println("Seu dado de ${meuDado.lados} lados rolou ${numeroSorteado}")
}

class Dado(val lados: Int) {
    
    fun rolar(): Int {
        val intervalo = 1..lados
    	val numeroSorteado = intervalo.random()
        return numeroSorteado
    }
}
