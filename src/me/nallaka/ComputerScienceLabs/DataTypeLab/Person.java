package me.nallaka.DataTypeLab;

/**
 * @author: Mithul Nallaka
 * @dateCreated: 8/28/2017
 * @dueDate: 8/31/2017
 * Purpose: Person Class
 * Methods: getName, getMiddleInitial, getAge, getTvCount, getFirstCellphoneAge, isExcessTimeOnPhone, setName, setMiddleInitial, setAge, setTvCount, setFirstCellphoneAge, setExcessTimeOnPhone, 
 */
public class Person {
    //Initializing Instance Vars
    private String name;
    private char middleInitial;
    private int age;
    private int tvCount;
    private int firstCellphoneAge;
    private boolean excessTimeOnPhone;

    public Person(String name, char middleInitial, int age, int tvCount, int firstCellPhoneAge, boolean excessTimeOnPhone){
        this.name = name;
        this.middleInitial = middleInitial;
        this.age = age;
        this.tvCount = tvCount;
        this.firstCellphoneAge = firstCellPhoneAge;
        this.excessTimeOnPhone = excessTimeOnPhone;
    }//end of Person constructor

    /**
     * @Name: getName
     * Purpose: Retrieve person's name
     * Input: None
     * Return: String name
     */
    public String getName() {
        return name;
    }//end getName
    
    /**
     * @Name: getMiddleInitial
     * Purpose: Retrieve person's middle initial
     * Input: None
     * Return: char middleInitial
     */
    public char getMiddleInitial(){
        return middleInitial;
    }//end getMiddleInitial
    
    /**
     * @Name: getAge
     * Purpose: Retrieve person's age
     * Input: None
     * Return: int age
     */
    public int getAge(){
        return age;
    }//end getAge
    
    /**
     * @Name: getTvCount
     * Purpose: Retrieve person's TV count
     * Input: None
     * Return: int tvCount
     */
    public int getTvCount() {
        return tvCount;
    }//end getTvCount
    
    /**
     * @Name: getFirstCellphoneAge
     * Purpose: Retrieve person's age when they received their first cellphone
     * Input: None
     * Return: int firstCellphoneAge
     */
    public int getFirstCellphoneAge() {
        return firstCellphoneAge;
    }//end getFirstCellphoneAge
    
    /**
     * @Name: isExcessTimeOnPhone
     * Purpose: Retrieve whether a person believes they spend too much time on their phone
     * Input: None
     * Return: boolean excessTimeOnPhone
     */
    public boolean isExcessTimeOnPhone() {
        return excessTimeOnPhone;
    }//end isExcessTimeOnPhone
    
    /**
     * @Name: setName
     * Purpose: Set person's name
     * Input: personName
     * Return: None
     */
    public void setName(String personName) {
        name = personName;
    }//end setName
    
    /**
     * @Name: setMiddleInitial
     * Purpose: Set person's middle initial
     * Input: char personMiddleInitial
     * Return: None
     */
    public void setMiddleInitial(char personMiddleInitial){
        middleInitial = personMiddleInitial;
    }//end setMiddleInitial
    
    /**
     * @Name: setAge
     * Purpose: Set person's age
     * Input: int personAge
     * Return: None
     */
    public void setAge(int personAge){
        age = personAge;
    }//end setAge
    
    /**
     * @Name: setTvCount
     * Purpose: Set person's TV count
     * Input: int personTvCount
     * Return: None
     */
    public void setTvCount(int personTvCount) {
        tvCount = personTvCount;
    }//end setTvCount
    
    /**
     * @Name: setFirstCellphoneAge
     * Purpose: Sets person's age when they received their first cellphone
     * Input: int personFirstCellphoneAge
     * Return: None
     */
    public void setFirstCellphoneAge(int personFirstCellphoneAge) {
        firstCellphoneAge = personFirstCellphoneAge;
    }//end setFirstCellphoneAge
    
    /**
     * @Name: setExcessTimeOnPhone
     * Purpose: Sets whether a person believes they spend too much time on their phone
     * Input: boolean personIsExcessTimeOnPhone
     * Return: None
     */
    public void setExcessTimeOnPhone(boolean personIsExcessTimeOnPhone) {
        excessTimeOnPhone = personIsExcessTimeOnPhone;
    }//end setExcessTimeOnPhone
    
    /**
     * @Name: printPersonStatistics
     * Purpose: Prints a person's statistics
     * Input: None
     * Return: String name, char middleInitial, int age, int firstCellphoneAge, int tvCount, boolean personisExcessTimeOnPhone
     */
    public void printPersonStatistics() {
        System.out.println("Name: " + getName());
        System.out.println("Middle Initial: " + getMiddleInitial());
        System.out.println("Age: " + getAge());
        System.out.println("Amount of TVs in house: " + getTvCount());
        System.out.println("Age when getting first cellphone: " + getFirstCellphoneAge());
        System.out.println("Believes they spend too much time on their phone: " + isExcessTimeOnPhone());
        System.out.println();
    }//end printPersonStatistics
}//end Person
