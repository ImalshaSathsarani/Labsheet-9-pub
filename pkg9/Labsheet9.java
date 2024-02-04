/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labsheet.pkg9;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

/**
 *
 * @author MODERN
 */
public class Labsheet9 {
   
    
    
   
static ArrayList<Shape>shapes=new ArrayList<>();
static String fileName="shapes.txt";
    
    public static void main(String[] args)throws IOException {
        
        getSavedShapesData();
        
        Scanner sc= new Scanner(System.in);
        String choice;
        
        do {
       
       
                System.out.println(""); 
        System.out.println("//////   WELCOME TO SHAPES   //////");
        System.out.println("a)Enter the details of the shape:");
        System.out.println("b)Get the details of the entered shapes  ");
        System.out.println("c)Exit");
         
        System.out.println("Enter your choice(a/b/c):");
        
        
         choice=sc.nextLine();
        
       
        
        
       switch(choice){
           case "a" -> {
               System.out.println("1)Line");
               System.out.println("2)Circle");
               System.out.println("3)Triangle");
               System.out.println("4)Rectangle");
               
               int s_type=sc.nextInt();
               
               if(s_type==1){
                   System.out.println("Enter the detils of the Line:");
                   System.out.println("Enter the point 1:");
                   System.out.println("Enter the x coordinate:");
                   int x1=sc.nextInt();
                   sc.nextLine();
                   System.out.println("Enter the y coordinate:");
                   int y1=sc.nextInt();
                   sc.nextLine();
                   System.out.println("Enter the point 2:");
                   System.out.println("Enter the x coordinate:");
                   int x2=sc.nextInt();
                   sc.nextLine();
                   System.out.println("Enter the y coordinate:");
                   int y2=sc.nextInt();
                   sc.nextLine();
                   Point p1=new Point(x1,y1);
                   Point p2=new Point(x2,y2);
                   Line line=new Line(p1,p2);
                   shapes.add(line);
                   
                   saveShapeData();
                   
                   System.out.println("The length of the line is:" );
                   double len=line.getCircumference();
                   System.out.println(len);
                   
                   System.out.println("The area of the line is always zero");
                   
                   
                   boolean s1=line.whetherPolygon();
                   if(!s1){
                       System.out.println("The line is not a polygon");
                   }
                  
               }
               
               if(s_type==2){
                   System.out.println("Enter the detils of the Circle:");
                   System.out.println("Enter the center point:");
                   System.out.println("Enter the x coordinate:");
                   int c_x=sc.nextInt();
                   sc.nextLine();
                   System.out.println("Enter the y coordinate:");
                   int c_y=sc.nextInt();
                   sc.nextLine();
                   
                   Point centerPoint=new Point(c_x,c_y);
                   
                   System.out.println("Enter the radius:");
                   double radius=sc.nextDouble();
                   sc.nextLine();
                   
                   Circle c1=new Circle(centerPoint,radius);
                   shapes.add(c1);
                   
                   saveShapeData();
                   
                   
                   System.out.println("The area of the circle is:");
                   double c_area=c1.getArea();
                   System.out.println(c_area+"square units.");
                   
                   System.out.println("The circumference of the circle is:");
                   double c_circumference=c1.getCircumference();
                   System.out.println(c_circumference);
                   
                   boolean s2=c1.whetherPolygon();
                   if(!s2){
                       System.out.println("The circle is not a polygon");
                   }
                  
               }
               
               if(s_type==3){
                   System.out.println("Enter the details of the Triangle:");
                   System.out.println("Enter the x coordinate of the first point:");
                   int t_x1=sc.nextInt();
                   sc.nextLine();
                   System.out.println("Enter the y coordinate of the first point:");
                   int t_y1=sc.nextInt();
                   sc.nextLine();
                   System.out.println("Enter the x coordinate of the second point:");
                   int t_x2=sc.nextInt();
                   sc.nextLine();
                   System.out.println("Enter the y coordinate of the second point:");
                   int t_y2=sc.nextInt();
                   sc.nextLine();
                   System.out.println("Enter the x coordinate of the third point:");
                   int t_x3=sc.nextInt();
                   sc.nextLine();
                   System.out.println("Enter the x coordinate of the third point:");
                   int t_y3=sc.nextInt();
                   sc.nextLine();
                   
                   Point p3=new Point(t_x1,t_y1);
                   Point p4=new Point(t_x2,t_y2);
                   Point p5=new Point(t_x3,t_y3);
                   
                   Triangle t1= new Triangle(p3,p4,p5);
                   shapes.add(t1);
                   saveShapeData();
                  
                   double t_circumference=t1.getCircumference();
                   System.out.println("The circumference of the triangle is:"+t_circumference);
                   
                   double t_area=t1.getArea();
                   System.out.println("The area of the triangle is:"+t_area+"square units.");
                   
                   boolean s3=t1.whetherPolygon();
                   if(s3){
                       System.out.println("The Triangle is a polygon");
                   }
                   
               }
               if(s_type==4){
                   
                   System.out.println("Enter the details of the rectangle:");
                   System.out.println("Enter the x coordinate of the top left point:");
                   int l_x=sc.nextInt();
                   sc.nextLine();
                   System.out.println("Enter the y coordinate of the top left point:");
                   int l_y=sc.nextInt();
                   sc.nextLine();
                   
                   Point topLeftPoint=new Point(l_x,l_y);
                   System.out.println("Enter the width of the rectangle:");
                   double width=sc.nextDouble();
                   System.out.println("Enter the heigth of the rectangle:");
                   double height=sc.nextDouble();
                   sc.nextLine();
                   
                   Rectangle r1= new Rectangle(topLeftPoint,width,height);
                   shapes.add(r1);
                   
                   saveShapeData();
                   
                   
                   double r_area=  r1.getArea();
                   System.out.println("The area of the rectangle is:"+r_area+"square units.");
                   
                   double r_circumference=r1.getCircumference();
                   System.out.println("The circumference of the rectangle is:"+r_circumference);
                   
                   boolean s4=r1.whetherPolygon();
                   if(s4){
                       System.out.println("The Rectangle is a polygon");
                   }
                   
               }     }
          
          case"b" -> printShapeDetails();
              
          case  "c" -> System.out.println("Exiting the program.Thank you...");
                   
                   
         }
     
        } while(!"c".equals(choice));
        
        
     
      
            }
        
        
          private static void printShapeDetails() {

           System.out.println("The details of all shapes:");
             for(Shape shape:shapes){
             
        System.out.println("Shape type: " + getShapeType(shape));
        System.out.println("Is Polygon: " + shape.whetherPolygon());
        System.out.println("Area: " + shape.getArea()+"square units.");
        System.out.println("Circumference: " + shape.getCircumference());
        System.out.println("----------------------------");
        
             }

          }
        
       private static String getShapeType(Shape shape){
              
              if(shape instanceof Line){
                  return "Line";
              }
              if(shape instanceof Circle){
                  return "Circle";
              }
              if(shape instanceof Triangle){
                  return "Triange";
              }
              if(shape instanceof Rectangle){
                  return "Rectangle";
              }else{
                  return "Unkonwn";
              }
          }
       
       private static void saveShapeData() throws IOException{
           try(FileWriter  writer=new FileWriter(fileName)){
               for (Shape  shape:shapes){
               if(shape instanceof Line){
                   Line line =(Line)shape;
                   writer.write("line,"+line.p1.x + ","+line.p1.y+","+line.p2.x+","+line.p2.y+"\n");
                   
               }else if(shape instanceof Circle){
               Circle circle=(Circle)shape;
               writer.write("circle,"+circle.centerPoint.x+","+circle.centerPoint.y+","+circle.radius+"\n");
               
               }else if(shape  instanceof  Triangle){
                   Triangle triangle=(Triangle)shape;
               writer.write("triangle," +triangle.p1.x+","+triangle.p1.y+","+triangle.p2.x+","+triangle.p2.y+","+triangle.p3.x+","+triangle.p3.y+"\n");
               
               }else  if(shape instanceof Rectangle){
               Rectangle rectangle=(Rectangle) shape;
               writer.write("Rectangle,"+rectangle.topLeftPoint.x+","+rectangle.topLeftPoint.y+","+rectangle.height+","+rectangle.width+"\n");
               
               }
               }
               System.out.println("Data added successfully");
           }catch(IOException e){
           System.out.println("An error ocurred");
           }
       }
           
           private static void getSavedShapesData() throws FileNotFoundException{
               try (Scanner fileScanner=new Scanner(new File(fileName))){
               while(fileScanner.hasNextLine()){
                   String l=fileScanner.nextLine();
                    
                   String[] details=l.split(",");
                   
                   if(details.length>0){
                       String shapeType=details[0].toLowerCase();
                       
                       switch(shapeType){
                           case"line":
                               shapes.add(new Line(
                               new Point(Integer.parseInt(details[1]),Integer.parseInt(details[2])),
                               new Point(Integer.parseInt(details[3]),Integer.parseInt(details[4]))
                               ));
                               
                               break;
                               
                           case "circle":
                               shapes.add(new Circle(new Point(Integer.parseInt(details[1]),Integer.parseInt(details[2])),Double.parseDouble(details[3])
                               ));
                               
                               break;
                               
                           case "triangle":
                               shapes.add(new Triangle(
                               new Point(Integer.parseInt(details[1]),Integer.parseInt(details[2])),
                                new Point(Integer.parseInt(details[3]),Integer.parseInt(details[4])),
                               new Point(Integer.parseInt(details[5]),Integer.parseInt(details[6]))
                               ));
                               
                               break;
                               
                           case "rectangle":
                               shapes.add(new Rectangle(
                               new Point(Integer.parseInt(details[1]),Integer.parseInt(details[2])),
                               Double.parseDouble(details[3]),
                               Double.parseDouble(details[4])
                               ));
                               
                               break;
                               
                           default:
                               System.out.println("Invalid input");
                               
                       }
                       
                   }
               }System.out.println("Data loaded from file");
               
               
               }catch(IOException e){
               System.out.println("An error ocurred");
               }
           
           }
}
           
       
       
       
      


        



    

       
       
       
       
       
           
       
        
        
    
    

