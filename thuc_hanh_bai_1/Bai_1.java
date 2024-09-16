package thuc_hanh_bai_1;

public class Bai_1 {
    public static void main(String[] args) {
        try {
            int width = Integer.parseInt(args[0]);
            int height = Integer.parseInt(args[1]);

            if (width > 0 && height > 0) {
                System.out.println((width + height) * 2);
                System.out.println(width*height);
            } else {
                System.out.println("Both width and height) must be greater than 0.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Please enter valid integers.");
        }
    }
}

