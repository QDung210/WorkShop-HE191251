
import java.util.*;


public class Part2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean check = false;
        String s = "";
        do {
            System.out.print("Enter the string 1: ");
            s = sc.nextLine();

            try {
                if (s.matches("SE\\d{3}")) {
                    System.out.println("the string is " + s);
                    check = true;
                } else {
                    System.out.println("the string is invalid");
                }
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        } while (!check);

        sc.close();
    }
}
