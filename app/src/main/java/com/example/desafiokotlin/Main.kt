package com.example.desafiokotlin

import java.text.DecimalFormat
import java.util.Scanner
import kotlin.math.pow

fun main(){
    //Desafio1()
    //Desafio2()
    //Desafio3()
    //Desafio4()
    Desafio5()
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

fun Desafio3() {
    // Entrada de dados
    val saldoTotal = readLine() !!.toInt()
    val valorSaque = readLine() !!.toInt()

    //TODO: Criar as condições necessárias para impressão da saída, vide tabela de exemplos.
    val saldoAtual = saldoTotal - valorSaque
    if(saldoTotal >= valorSaque){
        println("Saque realizado com sucesso. Novo saldo: ${saldoAtual}")
    }else{
        println("Saldo insuficiente. Saque nao realizado!")
    }
}

fun Desafio4() {
    val scanner = Scanner(System.`in`)
    val df = DecimalFormat("#.00")

    val valorInicial = scanner.nextDouble()

    val taxaJuros = scanner.nextDouble()

    val periodo = scanner.nextInt()

    //TODO: Iterar, baseado no período em anos, para calculo do valorFinal com os juros.
    var valorFinal = valorInicial * (1 + taxaJuros).pow(periodo)

    println("Valor final do investimento: R$ ${df.format(valorFinal)}")

    scanner.close()
}

fun Desafio5() {
    val scanner = Scanner(System.
    `in`)
    val valor = scanner.nextDouble()
    val df = DecimalFormat("#.00")

    if (valor > 0) {
        //TODO: Imprimir a mensagem de sucesso, formatando o saldo atual (vide Exemplos).
        println("Deposito realizado com sucesso!\n" +
                "Saldo atual: R$ ${df.format(valor)}")
    } else if (valor == 0.0) {
        //TODO: Imprimir a mensagem de valor inválido.
        println("Encerrando o programa...")
    } else {
        //TODO: Imprimir a mensagem de encerrar o programa.
        println("Valor invalido! Digite um valor maior que zero.")
    }
}