package com.aula1.atribuicaoreferencia;

public class Obj {

    Integer num;

    public Obj(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return this.num.toString();
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}
