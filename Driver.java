package driver;
import java.util.Scanner;
public class Driver {
public static void main(String args[]) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the size of transaction array");
        int sizeOfTransaction = userInput.nextInt();
         System.out.println("Enter the values of array");
        int[] valuesOfArray = new int[sizeOfTransaction];
        for (int i = 0; i < sizeOfTransaction; i++) {
            valuesOfArray[i] = userInput.nextInt();
        }
        for (int i = 0; i < sizeOfTransaction; i++) {
            
            System.out.println(valuesOfArray[i]);
        }
        System.out.println("Enter the total no of targets that needs to be achieved");
        int noOfTarget = userInput.nextInt();
        while (noOfTarget > -1) {
            System.out.println("Enter the value of target");
            int valueOfTarget = userInput.nextInt();

            int sumOfTransaction = 0;
            boolean achived = false;
            int i;

            for (i = 1; i <= sizeOfTransaction; i++) {
                sumOfTransaction += valuesOfArray[i - 1];
                System.out.println(sumOfTransaction);
                if (sumOfTransaction >= valueOfTarget) {
                    achived = true;
                    break;
                }
            }
            if (achived) {
                System.out.println("Target achieved after " + i + " transactions");
            } else
                System.out.println("Target is not achived !");

            noOfTarget--;
        }
        userInput.close();
    }

}