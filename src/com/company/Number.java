package com.company;

import java.util.Arrays;

public class Number {
    private int secondLowest;
    private int secondGreatest;


    /**
     * Method that takes in the arr array and
     * returns the secondLowest
     * and secondGreatest by utilizing the Arrays.sort
     * method. After sorting the array, the value in index 1
     * should be the secondLowest and the value in index.length-2
     * should be the secondGreatest.
     * @param arr
     */
    public void secondGreatLow(int[] arr) {

        Arrays.sort(arr);

        setSecondLowest(arr[1]);
        setSecondGreatest(arr[arr.length-2]);

        System.out.println(getSecondLowest()
                + " " + getSecondGreatest());

    }

    /**
     * Getters and setters
     * @param secondLowest
     */
    public void setSecondLowest(int secondLowest) {
        this.secondLowest = secondLowest;
    }

    public void setSecondGreatest(int secondGreatest) {
        this.secondGreatest = secondGreatest;
    }

    public int getSecondLowest() {
        return secondLowest;
    }

    public int getSecondGreatest() {
        return secondGreatest;
    }
}
