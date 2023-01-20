package com.trybe.acc.java.sistemadevotacao;

import java.util.ArrayList;

public class GerenciamentoVotacao {
  private ArrayList<PessoaCandidata> pessoasCandidatas = new ArrayList<PessoaCandidata>();
  private ArrayList<PessoaEleitora> pessoasEleitoras = new ArrayList<PessoaEleitora>();
  private ArrayList<String> cpfComputado = new ArrayList<String>();
  private int totalVotos;
  
  /** metodo que cadastra um candidato. */
  public void cadastrarPessoaCandidata(String nome, int numero) {
    for (int i = 0; i < pessoasCandidatas.size(); i++) {
      if (pessoasCandidatas.get(i).getNumero() == numero) {
        System.out.println("Número pessoa candidata já utilizado!");
        return;
      }
    }

    PessoaCandidata pessoaCandidata = new PessoaCandidata(nome, numero);
    pessoasCandidatas.add(pessoaCandidata);
  }


  /** metodo que cadastra um eleitor. */
  public void cadastrarPessoaEleitora(String nome, String cpf) {
    for (int i = 0; i < pessoasEleitoras.size(); i += 1) {
      if (pessoasEleitoras.get(i).getCpf().equals(cpf)) {
        System.out.println("Pessoa eleitora já cadastrada!");
        return;
      }
    }

    PessoaEleitora pessoaEleitora = new PessoaEleitora(nome, cpf);
    pessoasEleitoras.add(pessoaEleitora);
  }

  /** metodo para votar. */
  public void votar(String cpfPessoaEleitora, int numeroPessoaCandidata) {
    if (cpfComputado.contains(cpfPessoaEleitora)) {
      System.out.println("Pessoa eleitora já votou!");
      return;
    }

    for (int i = 0; i < pessoasCandidatas.size(); i += 1) {
      if (pessoasCandidatas.get(i).getNumero() == numeroPessoaCandidata) {
        pessoasCandidatas.get(i).receberVoto();
        cpfComputado.add(cpfPessoaEleitora);
        totalVotos += 1;
        return;
      }
    }
    System.out.println("Número de pessoa candidata não encontrado");
  }

  /** metodo para mostrar o resultado. */
  public void mostrarResultado() {
    if (totalVotos == 0) {
      System.out.println("É preciso ter pelo menos um voto para mostrar o resultado");
      return;
    }
    for (int i = 0; i < pessoasCandidatas.size(); i += 1) {
      String nome = pessoasCandidatas.get(i).getNome();
      int votos = pessoasCandidatas.get(i).getVotos();
      double porcentagem = (double) votos / totalVotos * 100;
      System.out.println("Nome: " + nome + " - " + votos + " votos (" + porcentagem + "% )");
    }
    System.out.println("Total de votos: " + totalVotos);
  }
}
