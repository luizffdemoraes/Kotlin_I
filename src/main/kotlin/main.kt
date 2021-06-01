fun main() {
    println("Bem vindo ao ByteBank.")
    //Instancia
    val contaAlex = Conta("Alex", 1000)
//    contaAlex.titular = "Alex"
//    contaAlex.numero = 1000
    contaAlex.deposita(-200.0)

    //label - rotulos para identificar parametros com isso não é
    // necessario inserir em um order especifica "flexibilidade" e possivel usar em contrutor e funções
    var contaFran = Conta(numero = 1001, titular = "Fran",  teste = 2)
//    contaFran.titular = "Fran"
//    contaFran.numero = 1001
    contaFran.deposita(300.0)

    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

    println("depositando na conta do Fran")
    //Classe se torna responsavel em alterar seus atributos
    contaAlex.deposita(50.0)
    println(contaAlex.saldo)

    println("depositando na conta do Alex")
    contaFran.deposita(70.0)
    println(contaFran.saldo)

    println("sacando na conta do Alex")
    contaAlex.saca(250.0)
    println(contaAlex.saldo)

    println("sacando na conta da Fran")
    contaFran.saca(100.0)
    println(contaFran.saldo)

    println("saque em excesso na conta do Alex")
    contaAlex.saca(100.0)
    println(contaAlex.saldo)

    println("saque em excesso na conta da Fran")
    contaFran.saca(500.0)
    println(contaFran.saldo)

    println("Transferência da conta da Fran para o Alex")

    //Label serve para identificação para até entender
    if (contaFran.transfere(valor = 100.0, destino = contaAlex)) {
        println("Tranferência bem sucedida")
    } else {
        println("Falha na transferência")
    }

    println(contaAlex.saldo)
    println(contaFran.saldo)
}

//Contrutor primario podemos fazer com que os parametros sejam as properties com valores opcionais
class Conta(
    val titular: String,
    val numero: Int,
    val teste: Int = 9
) {
    var saldo = 0.0
        private set //encapsulamento o deposita faz a funcionalidade do setter

//    Construtor secundario
//    constructor(titular: String, numero: Int){
//        this.titular = titular
//        this.numero = numero
//    }

    /*
     Não é preciso implementar uma função para ter o
     comportamento de getter e setters pois toda variavel ja tem seu get e set
     no Kotlin e conhecido como propriedade uma variavel que sempre vai ter acesso
     por meio de um geter e seter proprio
     */


    //função menbro da classe - Metodos ou Comportamentos da classe
    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    fun saca(valor: Double) {
        if (this.saldo >= valor) {
            saldo -= valor
        }

    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }

// Não é interessante no Kotlin getter e setter pois não é idiomatico
//    fun getSaldo(): Double {
//        return saldo
//    }
//
//    fun setSaldo(valor: Double) {
//        if (valor > 0) {
//            saldo = valor
//        }
//    }
//
//    fun getTitular(): String {
//        return titular
//    }
//
//    fun setTitular(titular: String) {
//        this.titular = titular
//    }
//
//    fun getNumero(): Int {
//        return numero
//    }
//
//    fun setNumero(numero: Int) {
//        this.numero = numero
//
//    }


}

fun testaCopiaEReferencias() {

    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val contaJoao = Conta("João", 1002)
//    contaJoao.titular = "João"
    //Atribuição de referenfia
    //var contaMaria = contaJoao
    var contaMaria = Conta("Maria", 1003)
//    contaMaria.titular = "Maria"
//    contaJoao.titular = "João"

    println("Titular conta João: ${contaJoao.titular}")
    println("Titular conta Maria: ${contaMaria.titular}")

    println(contaJoao)
    println(contaMaria)

}

//Controler de Estrutura de repetição
fun testaLacos() {
    //Estrutura de repetição while
    var i = 0
    while (i < 5) {

        val titular: String = "Alex $i"
        val numeroConta: Int = 1000 + i
        var saldo: Double = 0.0

        println("titular $titular")
        println("número da conta $numeroConta")
        println("saldo da conta $saldo")
        println()

        i++
    }

    //Estrutura de repetição for
//    for (i in 1..3) {
//    for (i in 5 downTo 1) {

    for (i in 5 downTo 1) {

        if (i == 4) {
            continue
        }
        val titular: String = "Alex $i"
        val numeroConta: Int = 1000 + i
        var saldo: Double = 0.0
        saldo = i + 10.0
//      Mesmo resultado da soma
        saldo = saldo + 200
        saldo += 200
        saldo -= 1000


        //String Template
        println("titular $titular")
        println("número da conta $numeroConta")
        println("saldo da conta $saldo")
        println()

//        //testaCondicoes(saldo)

    }
}

//Controle de fluxo - expressão booleana
//Função precisa informar variavel + tipo
fun testaCondicoes(saldo: Double) {

    if (saldo > 0.0) {
        println("Conta é positiva")
    } else if (saldo == 0.0) {
        println("Conta é neutra")
    } else {
        println("Conta é negativa")
    }

    when {
        saldo > 0.0 -> {
            println("Conta é positiva")
        }
        saldo == 0.0 -> {
            println("Conta é neutra")
        }
        else -> {
            println("Conta é negativa")
        }
    }
}

/*
    Variaveis
    -> var - seu valor pode ser modificado - mutavel
    -> val - seu valor não pode ser modificado - imutavel
    Não precisamos indicar o tipo ao inserir valor o tipo de valor fica implicito
    print não pula linha e necessario usar o println

    Tecnica String template inserir variaveis no escopo de uma string

    Restrição
    -> Ao criar uma variavel é necessário inicialização/atribuir um valor

    Declarar o tipo da variavel com : String
    No kotlin ele é estaticamente tipado de forma implicita

    Exibição simples
    print(titular)
    Exibição pulando linha
    println(titular)
    Forma de exibir String junto a variavel
    Concatenação
    println("titular " + titular)

*/