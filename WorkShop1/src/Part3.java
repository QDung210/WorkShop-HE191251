

import java.util.*;


public class Part3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] list = new String[10];
        System.out.println("Enter the list student name: ");
        for(int i = 0 ; i < 10; i++){
            System.out.print("list " + "["+i+"] : " );
            list[i] = sc.nextLine();
        }
        System.out.println("List after converted to Uppercase: ");
        for(int i = 0 ; i < 10; i++){
            System.out.println("list " + "["+i+"] : " + list[i].toUpperCase() );
        }
           
    }
}
