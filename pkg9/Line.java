/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labsheet.pkg9;


  public class Line extends Shape {
     Point p1;
     Point p2;
     
     public Line(Point p1,Point p2){
         this.p1=p1;
         this.p2=p2;
         
    }
     public Line(){}
    
     @Override
    public boolean whetherPolygon() {
    return false;
    }
        
    @Override
    public double getArea() {
         return 0;
                
    }
     @Override
    public double getCircumference(){
        double length=Math.sqrt((p1.getX()-p2.getX())*(p1.getX()-p2.getX())+(p1.getY()-p2.getY())*(p1.getY()-p2.getY()));
            return length;
        
    }
      
              
   
     }
       
    

