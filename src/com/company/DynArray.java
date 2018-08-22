/* package com.company;

import java.util.Arrays;


public class DynArray<T> {

    private T[] elementen;

    private int aantal;


    public DynArray() {



    }

    public int size() {

        return aantal;

    }

    public T get(int index) {

        if (index >= aantal) throw new ArrayIndexOutOfBoundsException("te groot");

        return elementen[index];

    }

    public void add(T getal) {

        if (aantal == elementen.length)
            elementen = resize(elementen);

        elementen[aantal] = getal;

        aantal++;

    }

    private T[] resize(T[] lijst) {

        int[] temp = new int[lijst.length * 2];

        System.arraycopy(lijst, 0, temp, 0, lijst.length);

        return temp;

    }

    public void sort() {

        Arrays.sort(elementen, 0, aantal);
    }

}


*/