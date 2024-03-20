package com.takeyouforward.recursion;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ParameterisedAndFunctionalRecursion {

    public static void main(String[] args) {

        int n = 6;

        log.info(String.valueOf(runningSumRecursion(n)));
    }

    public static int runningSumRecursion(int n){

        if(n == 0) return 0;

        return n + runningSumRecursion(n - 1);
    }
}
