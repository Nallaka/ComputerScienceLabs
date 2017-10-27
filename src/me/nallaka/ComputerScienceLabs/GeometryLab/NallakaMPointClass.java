package me.nallaka.ComputerScienceLabs.GeometryLab;

/**
 * @author: Mithul Nallaka
 * @dateCreated: 10/26/2017
 * @dueDate: N/A
 * Purpose: N/A
 * Methods:
 */

public class NallakaMPointClass {
    private int x;
    private int y;

    public NallakaMPointClass(int x, int y){
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String toString(){
        return "("+x+","+y+")";
    }

    public double distance(NallakaMPointClass b){
        return Math.sqrt(Math.pow(x-b.getX(),2)+Math.pow(y-b.getY(),2));
    }
}//end NallakaMPointClass