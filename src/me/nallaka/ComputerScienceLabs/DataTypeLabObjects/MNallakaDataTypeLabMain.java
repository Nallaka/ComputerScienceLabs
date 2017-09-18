package me.nallaka.dataTypeLab;

/**
 * @author: Mithul Nallaka
 * @dateCreated: 8/30/2017
 * @dueDate: 08/31/2017
 * Purpose: Print out information about people and overall statistics
 * Methods: main
 */
public class MNallakaDataTypeLabMain {
    /**
     * @Name: main
     * Purpose: Print out information about people and overall statistics
     * Input: None
     * Return: None
     */
    public static void main(String[] args) {

        //Initialize Evan's Variables

        String name1 = "Evan";
        char middleInitial1 = 'T';
        int age1 = 17;
        int tvCount1 = 6;
        int cellphoneAge1 = 12;
        boolean isExcessTimeOnPhone1 = false;

        //Initialize Mac's Variables
        String name2 = "Mac";
        char middleInitial2 = 'V';
        int age2 = 15;
        int tvCount2 = 2;
        int cellphoneAge2 = 12;
        boolean isExcessTimeOnPhone2 = false;

        //Initialize Pardhav's Variables
        String name3 = "Pardhav";
        char middleInitial3 = 'K';
        int age3 = 15;
        int tvCount3 = 3;
        int cellphoneAge3 = 12;
        boolean isExcessTimeOnPhone3 = false;

        //Initialize Landon's Variables
        String name4 = "Landon";
        char middleInitial4 = 'W';
        int age4 = 16;
        int tvCount4 = 4;
        int cellphoneAge4 = 12;
        boolean isExcessTimeOnPhone4 = true;

        //Initialize Holden's Variables
        String name5 = "Holden";
        char middleInitial5 = 'D';
        int age5 = 16;
        int tvCount5 = 4;
        int cellphoneAge5 = 12;
        boolean isExcessTimeOnPhone5 = true;

        //Printing Evan's Information
        System.out.println(name1 + "'s Statistics:");
        System.out.println("Middle Initial: " + middleInitial1);
        System.out.println("Age: " + age1);
        System.out.println("TV Count: " + tvCount1);
        System.out.println("Age when they got their first cellphone: " + cellphoneAge1);
        System.out.println("Believes they spend too much time on their phone: " + isExcessTimeOnPhone1);
        System.out.println();

        //Printing Mac's Information
        System.out.println(name2 + "'s Statistics:");
        System.out.println("Middle Initial: " + middleInitial2);
        System.out.println("Age: " + age2);
        System.out.println("TV Count: " + tvCount2);
        System.out.println("Age when they got their first cellphone: " + cellphoneAge2);
        System.out.println("Believes they spend too much time on their phone: " + isExcessTimeOnPhone2);
        System.out.println();

        //Printing Pardhav's Information
        System.out.println(name3 + "'s Statistics:");
        System.out.println("Middle Initial: " + middleInitial3);
        System.out.println("Age: " + age3);
        System.out.println("TV Count: " + tvCount3);
        System.out.println("Age when they got their first cellphone: " + cellphoneAge3);
        System.out.println("Believes they spend too much time on their phone: " + isExcessTimeOnPhone3);
        System.out.println();

        //Printing Landon's Information
        System.out.println(name4 + "'s Statistics:");
        System.out.println("Middle Initial: " + middleInitial4);
        System.out.println("Age: " + age4);
        System.out.println("TV Count: " + tvCount4);
        System.out.println("Age when they got their first cellphone: " + cellphoneAge4);
        System.out.println("Believes they spend too much time on their phone: " + isExcessTimeOnPhone4);
        System.out.println();

        //Printing Holden's Information
        System.out.println(name5 + "'s Statistics:");
        System.out.println("Middle Initial: " + middleInitial5);
        System.out.println("Age: " + age5);
        System.out.println("TV Count: " + tvCount5);
        System.out.println("Age when they got their first cellphone: " + cellphoneAge5);
        System.out.println("Believes they spend too much time on their phone: " + isExcessTimeOnPhone5);
        System.out.println();

        //Printing Total Statistics
        System.out.println("The average age is: " + ((age1 + age2 + age3 + age4 + age5)/5));
        System.out.println("The average amount of TVs: " + ((tvCount1 + tvCount2 + tvCount3 + tvCount4 + tvCount5)/5));
        System.out.println("The average age when people received their first cellphone: " + ((cellphoneAge1 + cellphoneAge2 + cellphoneAge3 + cellphoneAge4 + cellphoneAge5)/5));
        
    }//end main
}//end MNallakaDataTypeLabMain
