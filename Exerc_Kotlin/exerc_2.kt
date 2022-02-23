fun main() {
    var linguagens = mutableListOf("Kotlin", "Python", "C++")
    println(linguagens)
    linguagens[0] = "JavaScript" // Altera um valor específico da lista
    println(linguagens)
    if (linguagens.contains("Kotlin")) {
        println("Você sabe Kotlin")
    } else {
        println("Você NÃO SABE Kotlin")
    }
    for (linguagem in linguagens) {
        println("É legal programar em ${linguagem}")
    }
}
