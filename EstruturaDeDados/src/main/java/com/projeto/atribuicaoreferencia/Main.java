package com.projeto.atribuicaoreferencia;

public class Main {
    public static void main(String[] args) {
        int  nA = 1;
        int nB = nA;
        System.out.println("nA=" + nA + "nB=" + nB);

        nA = 2;
        System.out.println("nA=" + nA + "nB=" + nB);

        MyObject objectA = new MyObject(1);
        MyObject objectB = objectA;
        System.out.println("objectA=" + objectA + "objectB=" + objectB);
        objectA.setNum(2);
        System.out.println("objectA=" + objectA + "objectB=" + objectB);

    }
}
