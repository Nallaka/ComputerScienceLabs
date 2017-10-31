package me.nallaka.ComputerScienceLabs.GeometryLab;

/**
 * @author: Mithul Nallaka
 * @dateCreated: 10/26/2017
 * @dueDate: N/A
 * Purpose: N/A
 * Methods:
 */
public class NallakaMQuadClass {
    private double perimeter;
    private double area;
    private NallakaMPointClass a;
    private NallakaMPointClass b;
    private NallakaMPointClass c;
    private NallakaMPointClass d;

    public NallakaMQuadClass(NallakaMPointClass a, NallakaMPointClass b, NallakaMPointClass c, NallakaMPointClass d) {
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

    public double getArea() {
        double s1 = ((a.distance(b) + b.distance(c) + b.distance(d))/2);
        double s2 = ((c.distance(d) + d.distance(c) + b.distance(d))/2);
        double area1 = Math.sqrt(s1*(s1-a.distance(b))*(s1-b.distance(c))*(s1-b.distance(d)));
        double area2 = Math.sqrt(s2*(s2-c.distance(d))*(s2-d.distance(a))*(s2-b.distance(d)));
        area = area1 + area2;
        //area = Math.abs(((a.getX()*b.getY()-a.getY()*b.getX()) + (b.getX()*c.getY()-b.getY()*c.getX()) + (c.getX()*d.getY()-c.getY()*d.getX()) + (d.getX()*a.getY()-d.getY()*a.getX()))/2);
        return area;
    }
}//end NallakaMRectangleClass