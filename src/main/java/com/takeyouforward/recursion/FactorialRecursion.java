package com.takeyouforward.recursion;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FactorialRecursion {

    public static void main(String[] args) {

        int n = 4;

        log.info(String.valueOf(factorialRecursion(n)));
    }

    public static int factorialRecursion(int n){

        if(n == 0) return 1;

        return n * factorialRecursion(n - 1);
    }
}
