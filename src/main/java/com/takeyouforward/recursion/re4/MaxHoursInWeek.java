package com.takeyouforward.recursion.re4;

public class MaxHoursInWeek {

    public static void main(String[] args) {

        int[][] array = {
                {10, 7, 5},
                {5, 8, 5},
                {2, 9, 4},
                {7, 10, 7},
                {0, 2, 9},
                {1, 5, 2}
        };
        System.out.println(getMaxHoursInWeek(array.length - 1, array, 1));
    }

    public static int getMaxHoursInWeek(int index, int[][] array, int lastColumnIndex){

         int maxValue = -1;

        if(index == 0){
            for(int j = 0; j < array[index].length; j++){
                if(j != lastColumnIndex){

                    maxValue = Math.max(maxValue, array[index][j]);
                }
            }
            return maxValue;
        }

            for (int j = 0; j < array[index].length; j++) {
                if (j != lastColumnIndex) {

                    int thisDay = array[index][j] + getMaxHoursInWeek(index - 1, array, j);
                    maxValue = Math.max(maxValue, thisDay);
                }
            }
            return maxValue;
    }

    public static int getLastRowMaxHours(int index, int[][] array){

        int maxValue = -1;

        for(int j = 0; j < array[index].length; j++){

            int lastRowResult = getMaxHoursInWeek(array.length - 1, array, j);
            maxValue = Math.max(maxValue, lastRowResult);
        }
        return maxValue;
    }
}
