package ecu.fju;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
	
		Scanner scanner = new Scanner(System.in);
		 
        System.out.print("�п�J����: "); 
        int score = scanner.nextInt();
        int level = score / 10; 
 
        switch(level) { 
            case 10: 
            case 9: 
                System.out.println("�oA"); 
                break; 
            case 8: 
                System.out.println("�oB"); 
                break; 
            case 7: 
                System.out.println("�oC"); 
                break; 
            case 6: 
                System.out.println("�oD"); 
                break; 
            default: 
                System.out.println("�oE(���ή�)");
		
		}
	}

}
