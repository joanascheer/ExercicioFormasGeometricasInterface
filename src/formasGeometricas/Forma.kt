package formasGeometricas

interface Forma {

    var base: Double
    var altura: Double

    abstract fun calculaArea(forma: Forma) : Double

    abstract fun mostraArea(area: Double)
}