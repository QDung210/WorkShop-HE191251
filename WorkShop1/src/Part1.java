

import java.util.*;


public class Part1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: " );        
        int n = sc.nextInt();
        System.out.print("Enter number of columns:");  
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        int cnt = 0, sum = 0;
        System.out.println("Enter the matrix: " );
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m ; j++){
                System.out.print("arr"+"["+i+"]"+"["+j+"]" + "= "); arr[i][j] = sc.nextInt();
                sum += arr[i][j];
                cnt++;
            }
        }
        System.out.println("Matrix inputted: " );
        int line = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m ; j++){
                line++;
                if(line == 4){
                System.out.print("\n");
                }
                System.out.format("%3d", arr[i][j]);
            }
        }
        System.out.println("");
        double avg = (double)sum / cnt;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
    }
    
}
