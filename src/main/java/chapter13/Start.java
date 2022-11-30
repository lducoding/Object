package chapter13;

public class Start {
    private static int a = 1;
    private static int b = 2;
    private static String c ="1";
    private static String d ="2";

    public static void main(String[] args) {
//        Square square = new Square(10,10,10);
//        resize(square, 50, 100);
        System.out.println(a+b);
        System.out.println(c+d);
    }

    public static void resize(Rectangle rectangle, int width, int height) {
        rectangle.setWidth(width);
        rectangle.setHeight(height);
        System.out.println(rectangle.getWidth() == width && rectangle.getHeight() == height);
    }
}
