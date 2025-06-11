package com.aula1;

import com.aula1.atribuicaoreferencia.Obj;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // em tipos primitivos é copiado o valor que está em memória
        int intA = 1;
        int intB = intA;

        System.out.println("intA: " + intA + " intB: " + intB);

        // intB continua com o valor = 1;
        intA = 2;
        System.out.println("intA: " + intA + " intB: " + intB);

        // para objetos é copiado o endereço da memória

        Obj objA = new Obj(1);
        Obj objB = objA;
        System.out.println("objA: " + objA + " objB: " + objB);

        // ObjB terá o mesmo valor de ObjA pq o endereco da memória é copiado
        objA.setNum(2);
        System.out.println("objA: " + objA + " objB: " + objB);

    }
}