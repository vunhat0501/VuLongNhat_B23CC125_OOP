package thuc_hanh_bai_2;

public class Rectangle {
	int width;
	int height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public int getPerimeter() {
		if (width > 0 && height > 0) {
			return((width + height) * 2);
		} else {
            System.out.println("Both width and height must be greater than 0.");
            return 0;
        }
	}
	
	public int getArea() {
		if (width > 0 && height > 0) {
			return(width * height);
		} else {
            System.out.println("Both width and height must be greater than 0.");
            return 0;
        }
	}
}

class Display{
	public static void main(String[] args) {
		Rectangle ket_qua_1 = new Rectangle(3, 2);
		System.out.println(ket_qua_1.getPerimeter());
		System.out.println(ket_qua_1.getArea());
		
	}
}
