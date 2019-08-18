package com.company;

import com.company.positiveinteger.PositiveInteger;

public class Main {

    public static void main(String[] args) {
        int[] sampleArray1 = {1, 3, 6, 4, 1, 2};
        int[] sampleArray2 = {1, 3, 2};
        int[] sampleArray3 = {-1, -3};
        int[] sampleArray4 = {2, 3, -7, 6, 8, 1, -10, 15};
        PositiveInteger posInt = new PositiveInteger();

        String strArray = Integer.toString(posInt.getSmallestPositive(sampleArray4));

        System.out.println(strArray);
    }
}
