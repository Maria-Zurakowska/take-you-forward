package com.takeyouforward.recursion;

/*
 * I. Given an array of n integers and a given sum,
 * print all possible subsequences whose sum
 * is equal to the given sum.
 *
 * II. Given an array of n integers and a given sum,
 * return any subsequence whose sum is equal to the given sum.
 */

import java.util.ArrayList;
import java.util.List;

public class SubsequencesSumRecursionPrint {

    public static void main(String[] args) {

        int[] array = {1, 2, 1};
        int sum = 2;
        int s = 0;
        List<Integer> arrayList = new ArrayList<>();

        getArraySubsequencesSum(0, arrayList, array, s, sum);
        System.out.println(" ");
        getArrayAnySubsequenceSum(0, arrayList, array, s, sum);
    }

    public static void getArraySubsequencesSum(int index, List<Integer> arrayList, int[] arr, int s, int sum) {

        if (index == arr.length) {
            if (s == sum) {
                System.out.println(arrayList);
            }
            return;
        }
        // TAKE
        arrayList.add(arr[index]);
        s = s + arr[index];
        getArraySubsequencesSum(index + 1, arrayList, arr, s, sum);

        arrayList.remove(arrayList.size() - 1);
        s = s - arr[index];

        // NOT TAKE
        getArraySubsequencesSum(index + 1, arrayList, arr, s, sum);
    }

    public static boolean getArrayAnySubsequenceSum(int index, List<Integer> arrayList, int[] array, int s, int sum) {

        if (index == array.length) {
            // condition satisfied
            if (s == sum) {
                System.out.println(arrayList);
                return true;
            }
            // condition not satisfied
            return false;
        }
        arrayList.add(array[index]);
        s = s + array[index];
        if (getArrayAnySubsequenceSum(index + 1, arrayList, array, s, sum) == true) {
            return true;
        }
        arrayList.remove(arrayList.size() - 1);
        s = s - array[index];

        if (getArrayAnySubsequenceSum(index + 1, arrayList, array, s, sum) == true) {
            return true;
        }
        return false;
    }
}
