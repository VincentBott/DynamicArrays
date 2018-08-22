package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] getallen = new int[3];


        int teller = 0;
        int input;


        do {

            System.out.print("Geef getal: ");

            input = Integer.parseInt(scanner.nextLine());

            if (input >= 0) {


                if (teller == getallen.length) {

                    getallen = vergrootArray(getallen);
                }

                getallen[teller] = input;

                teller++;
            }

        } while (input >=0);


        Arrays.sort(getallen, 0, teller);  //  Dit is belangrijk !


        System.out.println("De gesorteerde lijst:");

        for (int i = 0; i < teller; i++) {
            System.out.println(getallen[i]);
        }
    }

    private static int[] vergrootArray(int[] getallen) {

        int[] nieuweArray = new int[getallen.length + 1];


        System.arraycopy(getallen, 0, nieuweArray, 0, getallen.length);

        getallen = nieuweArray;

        return getallen;
    }
}
