package me.nallaka.ComputerScienceLabs.GeometryLab;

/**
 * @author: Mithul Nallaka
 * @dateCreated: 10/26/2017
 * @dueDate: N/A
 * Purpose: N/A
 * Methods:
 */
public class NallakaMRectangleClass {
    private double perimeter;
    private double area;
    private NallakaMPointClass a;
    private NallakaMPointClass b;
    private NallakaMPointClass c;
    private NallakaMPointClass d;

    public NallakaMRectangleClass(NallakaMPointClass a, NallakaMPointClass b, NallakaMPointClass c, NallakaMPointClass d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
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

    public NallakaMPointClass getD() {
        return d;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        perimeter = (a.distance(b) + b.distance(c) + c.distance(d) + d.distance(a));
        return perimeter;
    }

    public double getArea(NallakaMPointClass a, NallakaMPointClass b, NallakaMPointClass c, NallakaMPointClass d) {
        area = ((Math.abs((a.getX()*b.getY() + b.getX()*c.getY() + c.getX()*d.getY() + d.getX()*a.getY() - b.getX()*a.getY() - c.getX()*b.getY()-d.getX()*c.getY()-a.getX()*d.getX())/2)));
        return area;
    }
}//end NallakaMRectangleClass