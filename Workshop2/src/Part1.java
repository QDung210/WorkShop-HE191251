


import java.util.Scanner;


public class Part1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        boolean check = false;

        do {
            System.out.print("Enter the number: ");
            try {
                number = Integer.parseInt(sc.nextLine());

                if (number < 1) {
                    System.out.println("The number is invalid");
                } else {
                    System.out.println("The number is " + number);
                    check = true;
                }
            } catch (Exception e) {
                System.out.println("The number is invalid");
            }
        } while (!check);

        sc.close();
    }
}
