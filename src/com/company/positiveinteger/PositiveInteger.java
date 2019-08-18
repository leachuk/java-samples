package com.company.positiveinteger;

import java.util.Arrays;
import java.util.HashSet;

public class PositiveInteger {

    public int getSmallestPositive(int[] arrayOfInts) {
        Arrays.sort(arrayOfInts);

        int i = 0;
        while (i < arrayOfInts.length - 1 && (arrayOfInts[i]+1 == arrayOfInts[i+1]  || arrayOfInts[i] == arrayOfInts[i+1] || arrayOfInts[i] < 0)) {
            System.out.println(arrayOfInts[i]);
            i++;
        }

        return arrayOfInts[i]+1 > 0 ? arrayOfInts[i]+1 : 1;
    }

    public int getSmallestPositive2(int[] arrayOfInts) {
        int[] a = arrayOfInts;
        HashSet<Integer> hashSet = new HashSet<Integer>();
        int smallInt = 1;

        for (int i = 0 ; i < a.length; i++) {
            hashSet.add(a[i]);
        }

        while (hashSet.contains(smallInt)) {
            smallInt++;
        }

        return smallInt;
    }
}
