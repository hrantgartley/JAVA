import java.util.Scanner;

public class SalesServiceInvoice {
    public static void main(String[] args) {
        System.out.println("Acr-zSales Sales As A Service - INVOICE");
        System.out.println("----------------------------------------");
        Scanner Scan = new Scanner(System.in);

        String CustomerName = "";
        String Address = "";
        String PaymentMethod = "";
        double CostOfService = 0.0;

        double ServiceFee = 1500;
        double TaxRate = .07;

        System.out.print("Enter Customer Name: ");
        CustomerName = Scan.nextLine();
        System.out.print("Enter Address: ");
        Address = Scan.nextLine();
        System.out.print("Enter Payment Method: ");
        PaymentMethod = Scan.nextLine();
        System.out.print("Enter Cost of Service: ");
        CostOfService = Scan.nextDouble();
        Scan.close();
        double TaxAmount = (CostOfService + ServiceFee) * TaxRate;
        double TotalCost = TaxAmount + CostOfService + ServiceFee;

        System.out.println("----------------------------------------");
        System.out.printf("%-23s %s\n", "Customer Name:", CustomerName);
        System.out.printf("%-23s %s\n", "Customer Address:", Address);
        System.out.printf("%-23s %s\n", "Mode of Payment:", PaymentMethod);

        System.out.println();

        System.out.printf("%-23s $%.2f\n", "Cost for Sales Service:", CostOfService);
        System.out.printf("%-23s $%.2f\n", "Service Fee:", ServiceFee);
        System.out.printf("%-2s %.0f%%\n", "Tax Rate:", TaxRate * 100);
        System.out.printf("%-23s $%.2f\n", "Tax Amount:", TaxAmount);
        System.out.printf("%-23s%9s\n", "", "--------");
        System.out.printf("%-23s $%.2f\n", "Total Payment:", TotalCost);

    }
}
