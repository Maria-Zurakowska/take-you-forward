package com.takeyouforward.recursion;

import java.util.ArrayList;
import java.util.List;

public class SubsequencesRecursionPrint {

    public static void main(String[] args) {

        int[] array = {3, 1, 2};
        List<Integer> arrayList = new ArrayList<>();

        getArraySubsequences(0, arrayList, array);
    }

    public static void getArraySubsequences(int index, List<Integer> arrayList, int[] arr){

        if (index >= arr.length){
            System.out.println(arrayList.toString());
            return;
        }
        //take the particular index into a subsequence
        arrayList.add(arr[index]);
        getArraySubsequences(index + 1, arrayList, arr);
        arrayList.remove(arrayList.size() - 1);

        //not take condition, this element is not added to the subsequence
        getArraySubsequences(index + 1, arrayList, arr);
    }
}
