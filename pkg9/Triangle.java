/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labsheet.pkg9;


public class Triangle extends Shape {
    Point p1;
    Point p2;
    Point p3;
   
public Triangle (Point p1,Point p2,Point p3){
        this.p1=p1;
        this.p2=p2;
        this.p3=p3;
    }

    @Override
    public boolean whetherPolygon() {
       return true;
    }

    @Override
    public double getCircumference() {
       double len1=Math.sqrt((p1.getX()-p2.getX())*(p1.getX()-p2.getX())+(p1.getY()-p2.getY())*(p1.getY()-p2.getY()));
       double len2=Math.sqrt((p2.getX()-p3.getX())*(p2.getX()-p3.getX())+(p2.getY()-p3.getY())*(p2.getY()-p3.getY()));
       double len3=Math.sqrt((p1.getX()-p3.getX())*(p1.getX()-p3.getX())+(p1.getY()-p3.getY())*(p1.getY()-p3.getY()));
       double length=len1+len2+len3;
       return length;
    }

    @Override
    public double getArea() {
        double t_area=Math.abs((p1.getX()*(p2.getY()-p3.getY())+p2.getX()*(p3.getY()-p1.getY())+p3.getX()*(p1.getY()-p2.getY()))/2.0);
        return t_area;
    }
    
}
