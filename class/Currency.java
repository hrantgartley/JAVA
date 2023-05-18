

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input a value to be converted to Euros: ");
        double Dollar = scan.nextDouble();
        double Euro = 0;
        Currency currency = new Currency();
        Euro = currency.UsdToEuro(Dollar);
        Euro = Math.round(Euro * 100.0) / 100.0;
        System.out.println(Dollar + " converted to Euros is " + Euro);
        System.out.println("Meep`");
        scan.close();
    }

    public double UsdToEuro(double Usd) {
        double Euro = 0;
        Euro = Usd * .91;
        return Euro;
    }
    public double EuroToUsd(double Euro) {
        double Usd = Euro * 1.10;
        return Usd;
    }
    public int Factorial(int n) {
        if (n == 1)
            return 1;
        else
            return Factorial(n) * n -1;
    }
    
}