import java.util.Scanner;

public class MinMaxArray {
    public static void main(String[] args) {
        int myArray[] = new int[5];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < myArray.length; i++) {
            System.out.print("Enter a number: ");
            myArray[i] = scan.nextInt();
        }

        MinMaxArray mma = new MinMaxArray();
        int Sum = mma.FindSum(myArray);
        int Min = mma.findMin(myArray);
        int Max = mma.findMax(myArray);
        int Prod = mma.findProd(myArray);

        System.out.println("The sum of the array is: " + Sum);
        System.out.println("The Min of the array is: " + Min);
        System.out.println("The Max of the array is: " + Max);
        System.out.println("The Product of the array is: " + Prod);
        scan.close();
    }

    public int findMax(int[] myArray) {
        return findMaxRec(myArray, 0, myArray.length - 1);
    }

    private int findMaxRec(int[] myArray, int start, int end) {
        if (start == end)
            return myArray[start];
        int mid = (start + end) / 2;
        int leftMax = findMaxRec(myArray, start, mid);
        int rightMax = findMaxRec(myArray, mid + 1, end);

        return Math.max(leftMax, rightMax);
    }

    public int findMin(int[] myArray) {
        return findMinRec(myArray, 0, myArray.length - 1);
    }

    private int findMinRec(int[] myArray, int start, int end) {
        if (start == end)
            return myArray[start];
        int mid = (start + end) / 2;
        int leftMin = findMinRec(myArray, start, mid);
        int rightMin = findMinRec(myArray, mid + 1, end);

        return Math.min(leftMin, rightMin);
    }

    public int FindSum(int[] myArray) {
        return FindSumRec(myArray, 0, myArray.length - 1);
    }

    private int FindSumRec(int[] myArray, int start, int end) {
        if (start == end)
            return myArray[start];
        int mid = (start + end) / 2;
        int leftSum = FindSumRec(myArray, start, mid);
        int rightSum = FindSumRec(myArray, mid + 1, end);

        return leftSum + rightSum;
    }

    public int findProd(int[] myArray) {
        return findProdRec(myArray, 0, myArray.length - 1);
    }

    private int findProdRec(int[] myArray, int start, int end) {
        if (start == end)
            return myArray[start];
        int mid = (start + end) / 2;
        int leftProd = findProdRec(myArray, start, mid);
        int rightProd = findProdRec(myArray, mid + 1, end);

        return leftProd * rightProd;
    }
}
