package com.example.desafiokotlin

fun main(){
    Desafio1()
    Desafio2()
}

fun Desafio1() {
    val saldoAtual = readLine()!!.toFloat()
    val valorDeposito = readLine()!!.toFloat()
    val valorRetirada = readLine()!!.toFloat()

    // Calcular o saldo atualizado de acordo com a descrição do desafio
    val saldoAtualizado = saldoAtual + valorDeposito - valorRetirada

    // Imprimir a saída com uma casa decimal
    println("Saldo atualizado na conta: %.1f".format(saldoAtualizado))
}

fun Desafio2(){
    val ativos = mutableListOf<String>()

    // Entrada da quantidade de ativos
    val quantidadeAtivos = readLine()!!.toInt()

    // Entrada dos códigos dos ativos
    for (i in 1..quantidadeAtivos) {
        val codigoAtivo = readLine()!!
        ativos.add(codigoAtivo)
    }

    //TODO: Ordenar os ativos em ordem alfabética.
    val ordenados = ativos.sorted()

    //TODO: Imprimir a lista de ativos ordenada, conforme a tabela de exemplos.
    for (ativo in ordenados) {
        println(ativo)
    }
}