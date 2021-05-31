fun main() {

    println("Olá Mundo. Bem vindo ao ByteBank")

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
     */

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


    //Estrutura de repetição
    // for (i in 1..3) {
    // for (i in 5 downTo 1) {

//    for (i in 5 downTo 1) {
//
//        if(i == 4){
//            continue
//        }
//        val titular: String = "Alex $i"
//        val numeroConta: Int = 1000 + i
//        var saldo: Double = 0.0
//        saldo = i + 10.0
//        Mesmo resultado da soma
//        saldo = saldo + 200
//        saldo += 200
//        saldo -= 1000
//
//        //Exibição simples
//        //print(titular)
//        //Exibição pulando linha
//        //println(titular)
//        //Forma de exibir String junto a variavel
//        //Concatenação
//        //println("titular " + titular)
//        //String Template
//        println("titular $titular")
//        println("número da conta $numeroConta")
//        println("saldo da conta $saldo")
//        println()
//        //Controle de fluxo - expressão booleana
//        //testaCondicoes(saldo)
//
//
//    }


}

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
