fun main() {
    
   var lista = listOf(3.14, 42, 22, 3.333, 5.9, 12, "ovo aparece kk")
  var linguagens = mutableListOf("Kotlin") // Adicionando um elemento no final
   linguagens.add("Java") // Adiciona um elemento na lista
   linguagens.add(1, "Python") // Adiciona um elemento em uma posição específica
   linguagens.add("C++")
   linguagens.remove("Java")
   for (element in lista) {
       println(element)
   }
   println("")
   println("------------------------------------------------------------")
   println("Primeiro elemento: ${lista[0]}")
   println("Último elemento: ${lista[lista.size - 1]}")
   println("------------------------------------------------------------")
   println("Linguagens disponíveis: ${linguagens}")
       
}