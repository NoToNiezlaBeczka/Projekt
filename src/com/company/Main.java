package com.company;

import java.util.Scanner;

public class Main {
int a = 0;
int b = 5;
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Poda swoje imie:");
	String imie = in.next();
        System.out.println("Poda swoje nazwisko:");
        String nazwisko = in.next();
        System.out.println("Poda swoje wiek:");
        String wiek = in.next();

        System.out.println("============================");
        System.out.println("Twoje imie to: " + imie);
        System.out.println("Twoje nazwisko to: " + nazwisko);
        System.out.println("Twoje wiek to: " + wiek);
        System.out.println("============================");

    }
}
