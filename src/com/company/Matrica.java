package com.company;

import java.util.Scanner;

public class Matrica implements Cloneable {
    int m;
    int n;
    private int[][] mat;

    public Matrica(int m, int n) {
        this.m = m;
        this.mat = new int[m][this.n = n];
    }

    public Matrica(Matrica matrica) {
        this.m = matrica.m;
        this.n = matrica.n;
        this.mat = new int[this.m][this.n];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                this.mat[i][j] = matrica.mat[i][j];
            }
        }
    }

    public Matrica clone() {
        try {
            return (Matrica)super.clone();
        } catch (CloneNotSupportedException e) {
            System.err.println(e);
        }
        return this;
    }

    public void citaj() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Unesi vrednosti:");
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                mat[i][j] = scan.nextInt();
            }
        }
    }

    public Matrica zbir(Matrica a, Matrica b) {
        try {
            if(a.m != b.m || a.n != b.n) {
                throw new Greska("Dimenzije nisu jednake");
            }
        } catch (Greska greska) {
            greska.printStackTrace();
        }
        Matrica c = new Matrica(a.m, a.n);
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                c.mat[i][j] = a.mat[i][j] + b.mat[i][j];
            }
        }
        return c;
    }

    @Override
    public String toString() {
        String s = "";
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                s += mat[i][j] + " ";
            }
            s += "\n";
        }
//        return s;

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                sb.append(mat[i][j] + " ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
