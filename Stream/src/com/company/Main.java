package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Integer> intlist = new ArrayList(Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4));
        Iterator<Integer> iter = intlist.iterator();
        while (iter.hasNext()) {

            Integer currentNumber = iter.next();

            if ((currentNumber.intValue() < 0) || (currentNumber.intValue() % 2 == 1)) {
                iter.remove();
            }

        }


        System.out.println(intlist);

    }

}









