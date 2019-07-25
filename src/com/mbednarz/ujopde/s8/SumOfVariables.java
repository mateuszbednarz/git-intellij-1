package com.mbednarz.ujopde.s8;

public class SumOfVariables {

    public static void main(String[] args) {

        int[] numbers = {1, 12, 21, 54, 13, 5, 77};

        int sum = 0;

        //for (int i = 0; i < numbers.length; i++)
        for (int number: numbers)
        {
            sum += number;
        }

        System.out.println(sum);
    }

}
