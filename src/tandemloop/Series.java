package tandemloop;

import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
    	System.out.println("Enter a");
        int term = (a % 2 == 0) ? (a - 1) : a; 

        for (int i = 1; i <= term; i++) {
            System.out.print((2 * i - 1));
            if (i < term) {
            	System.out.print(", ");
        }
            }
            
     
    }
}
