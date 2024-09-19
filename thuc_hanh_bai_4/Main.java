package thuc_hanh_bai_4;

public class Main {
 public static void main(String[] args) {
     Shape rectangle = new Rectangle(4, 5);
     System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());
     System.out.println("Rectangle Area: " + rectangle.getArea());

     Shape circle = new Circle(3);
     System.out.println("Circle Perimeter: " + circle.getPerimeter());
     System.out.println("Circle Area: " + circle.getArea());
 }
}

