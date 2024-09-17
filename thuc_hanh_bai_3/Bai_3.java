package thuc_hanh_bai_3;

public class Bai_3 {
    
    public class Common {
        public static boolean isPositive(int value) {
            return value > 0;
        }
    }

    public class Circle {
        private int radius;

        public Circle(int radius) {
            setRadius(radius); 
        }

        public int getRadius() {
            return radius;
        }

        public void setRadius(int radius) {
            if (Common.isPositive(radius)) {
                this.radius = radius;
            } else {
                System.out.println("Radius must be a positive integer.");
                this.radius = 0;
            }
        }

        public double getPerimeter() {
            return 2 * Math.PI * radius;
        }

        public double getArea() {
            return Math.PI * radius * radius;
        }
    }

    public class Rectangle {
        private int width;
        private int height;

        public Rectangle(int width, int height) {
            setWidth(width);
            setHeight(height);
        }

        public int getWidth() {
            return width;
        }

        public void setWidth(int width) {
            if (Common.isPositive(width)) {
                this.width = width;
            } else {
                System.out.println("Width must be a positive integer.");
                this.width = 0;
            }
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            if (Common.isPositive(height)) {
                this.height = height;
            } else {
                System.out.println("Height must be a positive integer.");
                this.height = 0;
            }
        }

        public int getPerimeter() {
            return (width + height) * 2;
        }

        public int getArea() {
            return width * height;
        }
    }

    public class Display {
        public void run() {
            Circle circle = new Circle(5);
            System.out.println("Circle Perimeter: " + circle.getPerimeter());
            System.out.println("Circle Area: " + circle.getArea());

            Rectangle rectangle = new Rectangle(4, 3);
            System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());
            System.out.println("Rectangle Area: " + rectangle.getArea());
        }
    }

    public static void main(String[] args) {
        Bai_3 outerClass = new Bai_3();
        Display display = outerClass.new Display(); 
        display.run();
    }
}
