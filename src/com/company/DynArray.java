package com.company;

import java.util.Arrays;


public class DynArray {

    private int[] elementen;

    private int aantal;


    public DynArray() {

        elementen = new int[4];

    }

    public int size() {

        return aantal;

    }

    public int get(int index) {

        if (index >= aantal) throw new ArrayIndexOutOfBoundsException("te groot");

        return elementen[index];

    }

    public void add(int getal) {

        if (aantal == elementen.length)
            elementen = resize(elementen);

        elementen[aantal] = getal;

        aantal++;

    }

    private int[] resize(int[] lijst) {

        int[] temp = new int[lijst.length * 2];

        System.arraycopy(lijst, 0, temp, 0, lijst.length);

        return temp;

    }

    public void sort() {

        Arrays.sort(elementen, 0, aantal);
    }

}

