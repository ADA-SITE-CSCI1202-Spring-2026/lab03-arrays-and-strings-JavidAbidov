import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a string to reverse:");
        String input = scanner.nextLine();
        

        StringBuilder sb = new StringBuilder(input);
        sb.reverse();
        
        System.out.println("Reversed string:");
        System.out.println(sb.toString());
        
        scanner.close();
    }
}