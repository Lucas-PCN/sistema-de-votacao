# Projeto Sistema de Votação

<p>Projeto entregue durante o curso de desenvolvimento Web ministrado pela <a href="https://www.betrybe.com" targe="_blank" rel="nofollow">Trybe</a>.</p>

<p>Obtive a aprovação no projeto completando 100% dos requisitos obrigatórios e opcionais. Efetivando, assim, a conclusão do Bloco 2 (Orientação a objetos) referente a Aceleração em Java.</p>

## Descrição
  Projeto de desenvolvimento de um sistema de votação eletrônico em Java, com o objetivo de permitir o cadastro de pessoas candidatas, pessoas eleitoras, a realização do processo de votação e a consulta do resultado parcial e final da votação.
  
  O projeto é composto por três etapas principais:

  CADASTRO DE PESSOAS CANDIDATAS: nesta etapa, será implementado um menu que possibilita o cadastro de pessoas candidatas. Após cadastrar uma nova pessoa, o sistema oferecerá a opção de cadastrar outra pessoa. Quando não houver mais pessoas candidatas a serem cadastradas, o sistema passará para a próxima etapa.
  
  CADASTRO DE PESSOAS ELEITORAS: nesta etapa, será implementado um menu que possibilita o cadastro de pessoas eleitoras, similar ao menu do cadastro de pessoas candidatas. Após cadastrar uma nova pessoa, o sistema voltará ao estado inicial do menu para oferecer a oportunidade de cadastrar outra pessoa. Quando não houver mais pessoas eleitoras a serem cadastradas, o sistema passará para a próxima etapa.
  
  PROCESSO DE VOTAÇÃO: nesta etapa, o sistema iniciará o processo de votação, que será realizado por meio de um menu que oferece as opções de votar, ver resultado parcial e finalizar a votação. Para votar, será necessário informar o identificador da pessoa eleitora e o número da pessoa candidata escolhida. A opção de ver resultado parcial lista todos os nomes das pessoas candidatas e seus respectivos votos absolutos e percentuais, enquanto a opção de finalizar a votação apresenta o resultado final da votação e encerra o programa. 

## Fluxo do sistema:
![Fluxo-sistema-de-votacao](https://github.com/Lucas-PCN/sistema-de-votacao/blob/main/img/sistema_votacao.png)


## Rodando o projeto localmente
  1. Clone o repositório
   
     `git@github.com:Lucas-PCN/sistema-de-votacao.git`
    
  2. Entre no diretório do repositório que você acabou de clonar:
  
     `cd sistema-de-votacao`

  3. Instale as dependências:
    
     `mvn install`

  4. Importe o projeto para uma IDE e interaja com o menu:
    
     `Run As Java Application`

## Demonstração

````
----------- Bem-vindo ao Sistema de Votação -----------

Cadastrar pessoa candidata?
1 - Sim
2 - Não
Entre com o número correspondente à opção desejada:
1
Entre com o nome da pessoa candidata:
Maria
Entre com o número da pessoa candidata:
1
Cadastrar pessoa candidata?
1 - Sim
2 - Não
Entre com o número correspondente à opção desejada:
1
Entre com o nome da pessoa candidata:
José
Entre com o número da pessoa candidata:
2
Cadastrar pessoa candidata?
1 - Sim
2 - Não
Entre com o número correspondente à opção desejada:
2


----------- Cadastre as pessoas eleitoras -----------

Cadastrar pessoa eleitora?
1 - Sim
2 - Não
Entre com o número correspondente à opção desejada:
1
Entre com o nome da pessoa eleitora:
João
Entre com o cpf da pessoa eleitora:
154.118.560-94
Cadastrar pessoa eleitora?
1 - Sim
2 - Não
Entre com o número correspondente à opção desejada:
1
Entre com o nome da pessoa eleitora:
Rute
Entre com o cpf da pessoa eleitora:
589.292.640-00
Cadastrar pessoa eleitora?
1 - Sim
2 - Não
Entre com o número correspondente à opção desejada:
1
Entre com o nome da pessoa eleitora:
Raquel
Entre com o cpf da pessoa eleitora:
023.476.580-18
Cadastrar pessoa eleitora?
1 - Sim
2 - Não
Entre com o número correspondente à opção desejada:
2


----------- Votação iniciada! -----------

Entre com o número correspondente à opção desejada:
1 - Votar
2 - Resultado Parcial
3 - Finalizar Votação
1
Entre com o cpf da pessoa eleitora:
154.118.560-94
Entre com o número da pessoa candidata:
1
Entre com o número correspondente à opção desejada:
1 - Votar
2 - Resultado Parcial
3 - Finalizar Votação
1
Entre com o cpf da pessoa eleitora:
589.292.640-00
Entre com o número da pessoa candidata:
1
Entre com o número correspondente à opção desejada:
1 - Votar
2 - Resultado Parcial
3 - Finalizar Votação
1
Entre com o cpf da pessoa eleitora:
023.476.580-18
Entre com o número da pessoa candidata:
2
Entre com o número correspondente à opção desejada:
1 - Votar
2 - Resultado Parcial
3 - Finalizar Votação
3
Nome: Maria - 2 votos ( 67.0% )
Nome: José - 1 votos ( 33.0% )
Total de votos: 3
````
---

Projeto desenvolvido por Lucas Castanheira, para fins didáticos. 2023
