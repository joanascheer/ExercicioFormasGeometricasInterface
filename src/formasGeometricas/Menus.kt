package formasGeometricas

import kotlin.system.exitProcess

class Menus {

    init {
        println("*** Seja bem vindo(a) a ***\n" +
                "CALCULADORA DE FORMAS BALEIA\n")

        menuPrincipal()

    }

    private fun menuPrincipal() {
        println("Escolha uma forma para calcular área e perímetro:\n" +
                "1 - Quadrado\n" +
                "2 - Retângulo\n" +
                "3 - Triângulo\n" +
                "4 - Losango\n" +
                "5 - Sair do sistema")
        when (readln()) {
            "1" -> {
                val quadrado = Quadrado().criaObjQuadrado()
                quadrado.calculaArea(quadrado)
                quadrado.calculaPerimetro()
                sucesso()
                menuPrincipal()
            }
            "2" -> {
                val retangulo = Retangulo().criaObjRetangulo()
                retangulo.calculaArea(retangulo)
                retangulo.calculaPerimetro()
                sucesso()
                menuPrincipal()
            }
            "3" -> {
                val triangulo = Triangulo().criaObjTriangulo()
                triangulo.calculaArea(triangulo)
                triangulo.calculaPerimetro()
                sucesso()
                menuPrincipal()
            }
            "4" -> {
                val losango = Losango().criaObjLosango()
                losango.calculaArea(losango)
                losango.calculaPerimetro()
                sucesso()
                menuPrincipal()
            }
            "5" -> {
                sairDoSistema()
            }
        }
    }

    companion object Mensagens {
        fun sucesso() {
            println("Processo realizado com sucesso!")
        }

        fun sairDoSistema() {
            println("Até mais!")
            exitProcess(0)
        }
    }
}