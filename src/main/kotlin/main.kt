fun main(){

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

    val titular: String = "Alex"
    val numeroConta: Int = 1000
    var saldo: Double  = 0.0
    saldo = 100 + 2.0
    //Mesmo resultado da soma
    //saldo = saldo + 200
    saldo += 200

    //Exibição simples
    //print(titular)
    //Exibição pulando linha
    //println(titular)
    //Forma de exibir String junto a variavel
    //Concatenação
    //println("titular " + titular)
    //String Template
    println("titular $titular")
    println("número da conta $numeroConta")
    println("saldo da conta $saldo")



}


