public class IT26102570Lab2Q2 {
    public static void main(String[] args) {
        double sideLength = 10.0;
        double perimeterSquare = 4 * sideLength;
        
        // PI = 22.0 / 7.0
        double pi = 22.0 / 7.0;
        
        // Perimeter of Square = Circumference of Circle
        // 40 = 2 * PI * radius
        double radius = perimeterSquare / (2 * pi);
        
        System.out.println("Radius of the circular fence: " + radius);
    }
}
