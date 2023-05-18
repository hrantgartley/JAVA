import java.util.Scanner;

public class RollDiceTimes {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int dice1, dice2;
        char rollAgain;
        do {
            for (int i = 0; i < 6; i++) {
                dice1 = (int) (Math.random() * 6) + 1;
                dice2 = (int) (Math.random() * 6) + 1;
                System.out.println("Rolling the dice..." + (i + 1));
                System.out.print("Their values are: " + dice1 + " " + dice2);
                System.out.println();
            }
            System.out.print("Do you want to roll again? (y/n): ");
            rollAgain = scan.next().charAt(0);
        } while (rollAgain == 'y');
        System.out.println("Thanks for playing");
        scan.close();

        
    }
}














