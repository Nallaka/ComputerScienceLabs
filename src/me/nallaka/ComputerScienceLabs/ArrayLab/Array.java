package me.nallaka.ComputerScienceLabs.ArrayLab;

public class Array {
    private int[] randomIntArray = new int[25];

    public Array(){
        for (int i = 0; i < randomIntArray.length; i++) {
            randomIntArray[1] = (int) (Math.random() * 11);
        }
    }

    public int sumArray(int boundOne, int boundTwo) {
       int runningSum = 0;
        for (int i = boundOne; i <= boundTwo ; i++) {
            runningSum = runningSum + randomIntArray[i];
        }
        return runningSum;
    }

    public int countArray(int value) {
        //Takes in avalue to look for and returns the number of occurances
        int runningTotal = 0;
        for (int i = 0; i < randomIntArray.length; i++) {
            if (i == value) {
                runningTotal++;
            }
        }
        return runningTotal;
    }

    public int[] multiplyArray(int value) {
        ///takes in value and returns array multiplied by that value
        int[] tempArray = new int[randomIntArray.length];
        for (int i = 0; i < randomIntArray.length; i++) {
            tempArray[i] = randomIntArray[i] * value;
        }
        return tempArray;
    }

    public int[] removeArray(int value) {
        //takes in value to remove and returns new array without the removed values
        int totalOccurances = 0;
        for (int aRandomIntArray : randomIntArray) {
            if (aRandomIntArray == value) {
                totalOccurances++;
            }
        }
        int[] tempArray = new int[randomIntArray.length-totalOccurances];
        int newArrayIndex = 0;
        for (int i = 0; i < randomIntArray.length; i++) {
            if (randomIntArray[i] != value) {
                tempArray[newArrayIndex] = randomIntArray[i];
                newArrayIndex++;
            }
        }

        return randomIntArray;
    }

    public String printMethodInfo() {
        return ("sumArray takes in integers as bounds and returns the sum of the values between those indexes" +
                "\ncountArray takes in a value and returns the number of occurrences of that value" +
                "\nmultiplyArray take sin a value and returns the array multiplied by that value" +
                "\nremoveArray takes in a value to remove and returns a new array without the removed values");
    }

}
