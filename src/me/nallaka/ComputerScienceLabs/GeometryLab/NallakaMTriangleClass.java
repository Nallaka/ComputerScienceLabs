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
    private NallakaMPointClass a;
    private NallakaMPointClass b;
    private NallakaMPointClass c;

    public NallakaMTriangleClass(NallakaMPointClass a, NallakaMPointClass b, NallakaMPointClass c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public NallakaMPointClass getA() {
        return a;
    }

    public NallakaMPointClass getB() {
        return b;
    }

    public NallakaMPointClass getC() {
        return c;
    }

    public double getPerimeter() {
        perimeter = (a.distance(b)+b.distance(c)+c.distance(a));
        return  perimeter;
    }

    public double getArea(NallakaMPointClass a, NallakaMPointClass b, NallakaMPointClass c) {
        double s =  ((a.distance(b) + b.distance(c) + c.distance(a))/2);
        area = Math.sqrt(s*(s-a.distance(b))*(s-b.distance(c))*(s-c.distance(a)));
        return area;
    }
}//end NallakaMTriangleClass