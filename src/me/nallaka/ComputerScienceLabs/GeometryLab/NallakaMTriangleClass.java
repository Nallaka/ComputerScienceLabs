package me.nallaka.ComputerScienceLabs.GeometryLab;

/**
 * @author: Mithul Nallaka
 * @dateCreated: 10/26/2017
 * @dueDate: N/A
 * Purpose: N/A
 * Methods:
 */
public class NallakaMTriangleClass {
    private double perimeter;
    private double area;

    public double getPerimeter() {
        return perimeter;
    }

    public double getArea() {
        return area;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter(NallakaMPointClass a, NallakaMPointClass b, NallakaMPointClass c) {
        setPerimeter(a.distance(b)+b.distance(c)+c.distance(a));
        return  perimeter;
    }

    public double getArea(NallakaMPointClass a, NallakaMPointClass b, NallakaMPointClass c) {
        setArea();
        return area;
    }
}//end NallakaMTriangleClass