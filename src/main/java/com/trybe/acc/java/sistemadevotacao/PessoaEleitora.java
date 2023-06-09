package com.trybe.acc.java.sistemadevotacao;

public class PessoaEleitora extends Pessoa {
  private String cpf;
  
  public PessoaEleitora(String nome, String cpf) {
    super.nome = nome;
    this.cpf = cpf;
  }
  
  public String getNome() {
    return super.nome;
  }
  
  public void setNome(String nome) {
    super.nome = nome;
  }
  
  public String getCpf() {
    return cpf;
  }
  
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
}
