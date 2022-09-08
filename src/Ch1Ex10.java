import java.util.Scanner;

public class Ch1Ex10 {
    public static void main(String[] args, Scanner in) {
        int minutes = 50;
        int seconds = 30;
        int time = minutes * 60 + seconds;
        int distance = 15;
        System.out.println("A runner runs " + distance + " kilometers in " + minutes + " minutes and " + seconds + " seconds\nAverage speed of runner: " + runnerSpeed(distance, time) + " miles/hour");
    }

    public static double runnerSpeed(int distance, int time) {
        double miles = distance / 1.6;
        return miles / (time / 3600);
    }
}