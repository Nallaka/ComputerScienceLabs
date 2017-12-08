package me.nallaka.ComputerScienceLabs.ArrayLabTwo;

import java.util.Arrays;

public class Race {
    private int[] raceArray;
    private int playerOneScore, playerTwoScore;

    public Race(int trackLength) {
        raceArray = new int[trackLength];
        playerOneScore = 0;
        playerTwoScore = 0;
    }

    public void newRound() {
        int playerOneIndex = 0;
        int playerTwoIndex = 0;
        int playerOneOldIndex = 0;
        int playerTwoOldIndex = 0;
        int turn = 1;
        while (raceArray[raceArray.length-1] == 0) {
            if (turn == 1) {
                playerOneIndex = playerOneOldIndex + ((int) ((Math.random() * 5) + 1));
                if (playerOneIndex != playerTwoIndex) {
                    raceArray[playerOneIndex] = 1;
                    raceArray[playerOneOldIndex] = 0;
                    System.out.println(Arrays.toString(raceArray));
                    playerOneOldIndex = playerOneIndex;
                } else {
                    raceArray[0] = 2;
                }
                turn = 2;
            } else {
                playerTwoIndex = playerTwoOldIndex + ((int) ((Math.random() * 5) + 1));
                if (playerOneIndex != playerTwoIndex) {
                    raceArray[playerTwoIndex] = 2;
                    raceArray[playerTwoOldIndex] = 0;
                    System.out.println(Arrays.toString(raceArray));
                    playerTwoOldIndex = playerTwoIndex;
                } else {
                    raceArray[0] = 1;
                }
                turn = 2;
            }
        }
        if (raceArray[raceArray.length-1] == 1) {
            playerOneScore++;
            System.out.println("Player One Won!");
        } else if (raceArray[raceArray.length-1] == 2) {
            playerTwoScore++;
            System.out.println("Player Two Won!");
        }
        System.out.println("Player One's Score: " + playerOneScore + "\nPlayer Two's Scor: " + playerTwoScore);

    }
}
