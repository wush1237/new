package ecu.fju;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
	
		Scanner scanner = new Scanner(System.in);
		 
        System.out.print("請輸入分數: "); 
        int score = scanner.nextInt();
        int level = score / 10; 
 
        switch(level) { 
            case 10: 
            case 9: 
                System.out.println("得A"); 
                break; 
            case 8: 
                System.out.println("得B"); 
                break; 
            case 7: 
                System.out.println("得C"); 
                break; 
            case 6: 
                System.out.println("得D"); 
                break; 
            default: 
                System.out.println("得E(不及格)");
		
		}
	}

}
