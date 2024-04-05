package com.takeyouforward.recursion.re4;

public class MaxHoursInWeek {

    public static void main(String[] args) {

        int[][] array = {
                {2,1,3},
                {3,4,6},
                {10,1,6},
                {8,3,7}
        };
        System.out.println(getLastRowMaxHours(array));
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

    public static int getLastRowMaxHours(int[][] array){

        int maxValue = -1;

        for(int j = 0; j < array[array.length - 1].length; j++){

            int lastRowResult = getMaxHoursInWeek(array.length - 1, array, j);
            maxValue = Math.max(maxValue, lastRowResult);
        }
        return maxValue;
    }
}
