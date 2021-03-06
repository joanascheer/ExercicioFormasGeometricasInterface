package formasGeometricas

class Triangulo(override var base: Double = 0.0, override var altura: Double = 0.0) : Forma {

    fun criaObjTriangulo(): Triangulo {
        println("Qual o tamanho da base do seu triângulo?")
        val base = readln().toDouble()

        println("Qual a altura do seu triângulo?")
        val altura = readln().toDouble()

        return Triangulo(base, altura)
    }

    override fun calculaArea(forma: Forma): Double {
        val area = base * altura
        mostraArea(area)
        return area
    }

    override fun calculaPerimetro(): Double {
        val perimetro = base * 3
        println("O perímetro do triângulo equilátero é $perimetro")
        return perimetro
    }

    override fun mostraArea(area: Double) {
        println("A área do triângulo é $area!\n")
    }
}