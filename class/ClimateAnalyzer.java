import java.util.Scanner;

public class ClimateAnalyzer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double snowfall = 0.0;

        while (true) {
            System.out.print("Enter the current snowfall in inches: ");
            snowfall = input.nextDouble();

            if (snowfall <= 3.5) {
                System.out.println("Snowfall is within safe limit.");
                break;
            } else {
                System.out.println("Snowfall exceeds safe limit. Waiting for 30 minutes...");
                try {
                    Thread.sleep(30 * 60 * 1); 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        input.close();

        System.out.println("Reporting to Weather Service...");
    }
}
