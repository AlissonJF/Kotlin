fun main() {
    var lista = listOf(3, 42, 22, 3, 5, 12)
    var media = 0.0
    var maior = lista[0]
    var menor = lista[0]
    for (num in lista) {
        if (num > maior) {
            maior = num
        }
        if (num < menor) {
            menor = num
        }
        media = media + num
    }
    media = media / lista.size
    println("A média é: ${media}")
    println("Menor é: ${menor}")
    println("Maior é: ${maior}")
}
