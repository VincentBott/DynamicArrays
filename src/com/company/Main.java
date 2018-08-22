package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int input;

        DynArray getallen = new DynArray();


        do {

            System.out.print("Geef getal: ");

            input = Integer.parseInt(scanner.nextLine());

            if (input >= 0)
                getallen.add(input);


        } while (input >=0);


        System.out.println("De gesorteerde lijst:");

        getallen.sort();

        for (int i = 0; i < getallen.size(); i++) {
            System.out.println(getallen.get(i));
        }
    }

}
