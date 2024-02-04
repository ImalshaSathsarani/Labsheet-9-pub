/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labsheet.pkg9;


public class Rectangle  extends Shape{
    Point topLeftPoint;
    double width,height;
    
    public Rectangle(Point point,double width,double height){
        this.topLeftPoint=point;
        this.width=width;
        this.height=height;
    }

    @Override
    public boolean whetherPolygon() {
        return true;
    }

    @Override
    public double getCircumference() {
        double r_circumference=2*(width+height);
        return r_circumference;
        
    }

    @Override
    public double getArea() {
        double r_area=width*height;
        return r_area;
    }
    
}
