import java.util.Scanner;

@SuppressWarnings("resource")
public class Exercise02_12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter speed and acceleration: ");
        double speed = in.nextDouble();
        double acceleration = in.nextDouble();
        
        double length = speed * speed / (2 * acceleration);
        System.out.println("The minimum runaway length for this airplane is " + Math.round(length * 1000) / 1000.0);
    }
}
