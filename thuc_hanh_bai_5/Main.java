package thuc_hanh_bai_5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        
        shapes.add(new Rectangle(10, 11));  
        shapes.add(new Circle(9));        
        shapes.add(new Rectangle(7, 8));  
        shapes.add(new Circle(6));        

        double totalArea = 0;
        double totalPerimeter = 0;

        for (Shape shape : shapes) {
            totalArea += shape.getArea();         
            totalPerimeter += shape.getPerimeter();
        }

        System.out.println("Total Area: " + totalArea);
        System.out.println("Total Perimeter: " + totalPerimeter);
    }
}