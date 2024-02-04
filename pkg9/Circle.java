/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labsheet.pkg9;


public class Circle extends Shape {
    Point centerPoint;
    double radius;

    public Circle(Point centerpoint,double radius) {
        this.centerPoint=centerpoint;
        this.radius=radius;
    }
    
    

    @Override
    public boolean whetherPolygon() {
         return false;
    }

    @Override
    public double getCircumference() {
        double c_circumference=2*Math.PI*radius;
        return c_circumference;
    }

    @Override
    public double getArea() {
        double c_area=Math.PI*radius*radius;
        return c_area;
    }
       
    
}
