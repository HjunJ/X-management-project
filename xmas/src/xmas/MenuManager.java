package xmas;

import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. Add Member");
			System.out.println("2. Delete Member");
			System.out.println("3. Edit Member");
			System.out.println("4. View Member");
			System.out.println("5. Menu");
			System.out.println("6. Exit");
			String a = input.next();
			char str = a.charAt(0);
			if(str == '5') {
				continue;
			}
			
			else if(str == '6') {
				System.out.println("Thank you for Subscribing!");
				break;
			}
			else break;
		}
	}

}
