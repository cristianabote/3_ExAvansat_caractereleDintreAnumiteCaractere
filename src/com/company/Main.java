package com.company;

import com.sun.javafx.binding.StringFormatter;

import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // scrie un program care afiseaza caracterele dintre 2 caractere precizate, pe fiecare linie afisandu-se maxim 8 caractere cu spatiu
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduceti sirul dorit: ");
        String sir = scan.nextLine();
        System.out.println("Introduceti cele doua caractere :");
        char c1 = scan.next().charAt(0);
        char c2 = scan.next().charAt(0);
        caractere(sir,c1,c2);

    }

    public static void caractere(String sir, char c1, char c2) {
        int nrIndexc1 = sir.indexOf(c1);
        int nrIndexc2 = sir.indexOf(c2);
        for (int i = nrIndexc1 + 1; i < nrIndexc2; i++) {
            System.out.print(sir.charAt(i)+" ");
            }
        }

}

