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

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter(NallakaMPointClass a, NallakaMPointClass b, NallakaMPointClass c, NallakaMPointClass d) {
        setPerimeter(a.distance(b) + b.distance(c) + c.distance(d) + d.distance(a));
        return perimeter;
    }

    public double getArea(NallakaMPointClass a, NallakaMPointClass b, NallakaMPointClass c, NallakaMPointClass d) {
        setArea((1/2)* Math.abs(a.getX()*b.getY() + b.getX()*c.getY() + c.getX()*d.getY() + d.getX()*a.getY() - b.getX()*a.getY() - c.getX()*b.getY()-d.getX()*c.getY()-a.getX()*d.getX()));
        return area;
    }
}//end NallakaMRectangleClass