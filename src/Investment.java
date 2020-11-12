import java.util.Scanner;

public class Investment {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double intersetRate = 1.0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter investment amount: ");
        money = sc.nextDouble();
        System.out.print("Enter number of month: ");
        month = sc.nextInt();
        System.out.print("Enter annual interest rate in percentage: ");
        intersetRate = sc.nextDouble();
        double totalInterset = 0.0;
        for (int i = 0; i < month; i++) {
            totalInterset += money *(intersetRate/100)/12*month;
        }
        System.out.println("Total of interset: ");
        //abc
    }
}
