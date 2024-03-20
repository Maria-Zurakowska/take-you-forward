package com.takeyouforward.recursion.re4;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SwapArrayElementsRecursion {

    public static void main(String[] args) {

        int n = 5;
        int[] array = {1,2,3,4,5};

        log.info("Array before reversing");

        for(int initialValue : array){
            log.info(String.valueOf(initialValue));
        }
        reverseArrayElementsRecursion(array, 0, n);

        log.info("Array after reversing elements");

        for(int value : array){
            log.info(String.valueOf(value));
        }
    }

    public static void reverseArrayElementsRecursion(int[] array, int i, int n){

        if(i >= n / 2) return;

        int temp = array[i];
        array[i] = array[n - i - 1]; // first [zero] element will be the last
        array[n - i - 1] = temp; // last element will be the first [zero]

        reverseArrayElementsRecursion(array, i + 1, n);
    }
}
