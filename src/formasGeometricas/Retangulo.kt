package formasGeometricas

class Retangulo (override var base: Double = 0.0, override var altura: Double = 0.0) : Forma {

    fun criaObjRetangulo(): Retangulo {
        println("Qual o tamanho da base do seu retângulo?")
        val base = readln().toDouble()

        println("Qual a altura do seu retângulo?")
        val altura = readln().toDouble()

        return Retangulo(base, altura)
    }

    override fun calculaArea(forma: Forma): Double {
        val area = base * altura
        mostraArea(area)
        return area
    }

    override fun mostraArea(area: Double) {
        println("A área do retângulo é $area!\n")
    }
}