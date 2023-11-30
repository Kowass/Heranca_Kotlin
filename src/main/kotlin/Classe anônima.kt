fun main() {
    val p:Programa = Programa()
    //val e:Event = Event()
    p.salvar(object : Evento{
        override fun ok() {
            println("O programa está ok!")
        }
    })
}

interface Evento{
    fun ok(){
        println("O progrmaa está ok!")
    }
}

class Programa{
    fun salvar(e:Evento){
        println("Abrindo arquivos")
        println("Salvando valores")
        println("Salvando arquivos")
        println("Conexões realizadas")
        e.ok()
    }
}
/*
class Event():Evento{
    override fun ok() {
        println("O programa está ok")
    }
}
 */