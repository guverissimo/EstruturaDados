package com.aula1.conceitodeno;

public class Main {

    public static void main(String[] args) {
        // Coinceito de Nó e encadeamento de nó

        No<String> no1 = new No<>("Conteudo No1");

        No<String> no2 = new No<>("Conteudo No2");
        no1.setProximoNo(no2);

        No<String> no3 = new No<>("Conteudo No3");
        no2.setProximoNo(no3);

        No<String> no4 = new No<>("Conteudo No4");
        no3.setProximoNo(no4);

        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());

        // Result
//        No{conteudo='Conteudo No1'}
//        No{conteudo='Conteudo No2'}
//        No{conteudo='Conteudo No3'}
//        No{conteudo='Conteudo No4'}
//        null
    }
}
