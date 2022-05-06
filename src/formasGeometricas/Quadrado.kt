package formasGeometricas

class Quadrado(override var base: Double = 0.0, override var altura: Double = 0.0) : Forma {


    fun criaObjQuadrado(): Quadrado {
        println("Qual o tamanho da base do seu quadrado?")
        val base = readln().toDouble()

        println("Qual a altura do seu quadrado?")
        val altura = readln().toDouble()

        return Quadrado(base, altura)
    }

    override fun calculaArea(forma: Forma): Double {
        val area = base * altura
        mostraArea(area)
        return area
    }

    override fun calculaPerimetro(): Double {
        val perimetro = base * 4
        println("O perímetro do quadrado é $perimetro")
        return perimetro
    }

    override fun mostraArea(area: Double) {
        println("A área do quadrado é $area!\n")
    }

}
