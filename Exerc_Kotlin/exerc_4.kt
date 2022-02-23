fun main() {
    avaliarFilme("Star Wars", 5)
    avaliarFilme("Xuxa contra o baixo-astral", 1)
    avaliarFilme("Os trapalhões na serra pelada", 6)
}

fun avaliarFilme(filme: String,  nota: Int) {
    var avaliação = ""
    when (nota) {
        1 -> avaliação = "Ruim"
        2 -> avaliação = "Regular"
        3 -> avaliação = "Bom"
        4 -> avaliação = "Ótimo"
        5 -> avaliação = "Exelente"
        else -> avaliação = "NÃO AVALIADO"
    }
    println("O filme ${filme} recebeu a avaliação: ${avaliação}")
}
