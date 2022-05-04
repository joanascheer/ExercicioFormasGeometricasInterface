package formasGeometricas

class Losango(override var base: Double = 0.0, override var altura: Double = 0.0) : Forma {

    fun criaObjLosango(): Losango {
        println("Qual o tamanho da base do seu losango?")
        val base = readln().toDouble()

        println("Qual a altura do seu losango?")
        val altura = readln().toDouble()

        return Losango(base, altura)
    }

    override fun calculaArea(forma: Forma): Double {
        val area = base * altura
        mostraArea(area)
        return area
    }

    override fun mostraArea(area: Double) {
        println("A área do losango é $area!\n")
    }


}