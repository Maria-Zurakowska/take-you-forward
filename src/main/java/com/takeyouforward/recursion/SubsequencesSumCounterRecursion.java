package com.takeyouforward.recursion;

/*
 * Count the number of subsequences whose sum equals to a given 'sum'.
 * */
public class SubsequencesSumCounterRecursion {

    public static void main(String[] args) {

        int s = 0;
        int sum = 2;
        int[] array = {1, 2, 1};

        System.out.println(getSubsequencesSumCounter(0, array, s, sum));
    }

    public static int getSubsequencesSumCounter(int index, int[] array, int s, int sum) {

        if (index == array.length) {
            // condition satisfied
            if (s == sum) {
                return 1;
            }
            // condition not satisfied
            else {
                return 0;
            }
        }
        // TAKE
        s = s + array[index];
        int left = getSubsequencesSumCounter(index + 1, array, s, sum);

        s = s - array[index];

        //NOT TAKE
        int right = getSubsequencesSumCounter(index + 1, array, s, sum);

        return left + right;
    }
}
