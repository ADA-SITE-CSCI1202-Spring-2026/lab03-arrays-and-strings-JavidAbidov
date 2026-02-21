import java.util.Arrays;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {


        if (args.length > 0) {
            int[] clArray = new int[args.length];
            for (int i = 0; i < args.length; i++) {
                clArray[i] = Integer.parseInt(args[i]);
            }
            System.out.println("Command Line Array: " + Arrays.toString(clArray));
            printMinMax(clArray);
        }



        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();

        int[] scArray = new int[n];

        System.out.println("Enter " + n + " integers:");

        for (int i = 0; i < n; i++) 
        {
            scArray[i] = input.nextInt();
        }
        
        printMinMax(scArray);
    }



    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) min = num;
        }
        return min;
    }

    public static int findMax(int[] arr) {
    
        int max = arr[0];
        for (int num : arr) 
        {
            if (num > max) max = num;
        }

        return max;
    }



    public static void printMinMax(int[] arr) 
    {
        if (arr.length == 0) return;

        System.out.println("Minimum: " + findMin(arr));

        System.out.println("Maximum: " + findMax(arr));
    }
}