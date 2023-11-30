// Private, Public e Protected
// Private: Consigo modificar e visualizar as váriais somente dentro da própria classe

private class F(){ // Estará disponivel somente no arquivo
    var teste = "Classe F"
}

open class ELetronic(var marca:String){
    fun ligar(){
        println("Está ligado")
    }
    fun desligar(){
        println("Está desligado")
    }
    var modelo:String = "Teste de herança"
}

class Computador(marca:String):ELetronic(marca){
    fun InslarSofrware(){
        println("Instalando Software no pc")
    }
    fun Varredura(){
        println("Realizando varredura no computador")
    }
}

fun main(){
    var c:Computador = Computador("Dell")
    c.ligar()
    c.desligar()
    c.Varredura()
    c.InslarSofrware()
    println(c.modelo)
}