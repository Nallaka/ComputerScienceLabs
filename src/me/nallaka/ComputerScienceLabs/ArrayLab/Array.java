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
        for (int i = 0; i < randomIntArray.length; i++) {
            if (randomIntArray[i] == value) {
                totalOccurances++;
            }
        }
        int[] tempArray = new int[randomIntArray.length-totalOccurances];
        for (int i = 0; i < tempArray.length; i++) {
            if (randomIntArray[i] != value) {
                tempArray[i] = randomIntArray[i];
            }
        }
        return randomIntArray;
    }

}
