package com.company;

public class Main {

    public static void main(String[] args) {
        Matrica a = new Matrica(4, 4);
        System.out.println(a);
        a.citaj();
        System.out.println(a);
        Matrica b = new Matrica(a);
        System.out.println(b);
        Matrica c = b.clone();
        System.out.println(c);
        c = c.zbir(a, b);
        System.out.println(c);
    }
}
