package tandemloop;

import java.util.Scanner;

public class OddNum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a");
		int a = s.nextInt();
        for (int i = 1; i <= a; i++) {   
            int o = 2 * i - 1;         
            System.out.print(o);       

            if (i < a) {                
                System.out.print(", ");
            }
        }
	}
}
