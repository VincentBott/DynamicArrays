package com.company;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;


public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Geef getallen in (negatief om te stoppen):  ");

        int getal = Integer.parseInt(scanner.nextLine());

        ArrayList<Integer> getallen = new ArrayList<>();

        while(getal >= 0){

            getallen.add(getal);

            System.out.print("Geef getallen in (negatief om te stoppen):  ");

            getal = Integer.parseInt(scanner.nextLine());

        }

        Collections.sort(getallen);

        System.out.println("De gesorteerde getallen: ");

        for (int i = 0; i < getallen.size(); i++) {

            System.out.println(getallen.get(i));

        }

    }

}
