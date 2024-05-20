
import java.util.*;


public class Part2_2 {
    public static String inputString() throws Exception {
        Scanner sc = new Scanner(System.in);
        String s;
        boolean check = false;

        do {
            System.out.print("Input the string 1: ");
            s = sc.nextLine();

            try {
                if (s.matches("SE\\d{3}")) {
                    check = true;
                } else {
                    System.out.println("the string is invalid");
                }
            } catch (Exception e) {
                throw new Exception("An unexpected error occurred while processing the input");
            }
        } while (!check);

        sc.close();
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String validString = inputString();
            System.out.println("the string is " + validString);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
    
}

