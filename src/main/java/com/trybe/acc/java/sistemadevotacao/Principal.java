package com.trybe.acc.java.sistemadevotacao;

import java.util.Scanner;

public class Principal {

  /**
   * Método principal.
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    short opcaoDesejada;

    GerenciamentoVotacao gerenciamentoVotacao = new GerenciamentoVotacao();

    System.out.println("----------- Bem-vindo -----------");
    do {
      System.out.println("Cadastrar pessoa candidata?");
      System.out.println("1 - Sim");
      System.out.println("2 - Não");
      System.out.println("Entre com o número correspondente à opção desejada:");
      opcaoDesejada = scanner.nextShort();

      if (opcaoDesejada == 1) {
        System.out.println("Entre com o nome da pessoa candidata:");
        String nomePessoaCandidata = scanner.next();
        System.out.println("Entre com o número da pessoa candidata:");
        int numeroPessoaCandidata = scanner.nextInt();

        gerenciamentoVotacao.cadastrarPessoaCandidata(nomePessoaCandidata, numeroPessoaCandidata);
      }
    } while (opcaoDesejada != 2);

    do {
      System.out.println("Cadastrar pessoa eleitora?");
      System.out.println("1 - Sim");
      System.out.println("2 - Não");
      System.out.println("Entre com o número correspondente à opção desejada:");
      opcaoDesejada = scanner.nextShort();

      if (opcaoDesejada == 1) {
        System.out.println("Entre com o nome da pessoa eleitora:");
        String nomePessoaEleitora = scanner.next();
        System.out.println("Entre com o cpf da pessoa eleitora:");
        String cpfPessoaEleitora = scanner.next();

        gerenciamentoVotacao.cadastrarPessoaEleitora(nomePessoaEleitora, cpfPessoaEleitora);
      }
    } while (opcaoDesejada != 2);

    do {
      System.out.println("Entre com o número correspondente à opção desejada:");
      System.out.println("1 - Votar");
      System.out.println("2 - Resultado Parcial");
      System.out.println("3 - Finalizar Votação");
      opcaoDesejada = scanner.nextShort();

      if (opcaoDesejada == 1) {
        System.out.println("Entre com o cpf da pessoa eleitora:");
        String cpfPessoaEleitora = scanner.next();
        System.out.println("Entre com o número da pessoa candidata:");
        int numeroPessoaCandidata = scanner.nextInt();

        gerenciamentoVotacao.votar(cpfPessoaEleitora, numeroPessoaCandidata);
      }


      if (opcaoDesejada == 2) {
        gerenciamentoVotacao.mostrarResultado();
      }

      if (opcaoDesejada == 3) {
        gerenciamentoVotacao.mostrarResultado();
      }

    } while (opcaoDesejada != 3);
    scanner.close();
  }
}
