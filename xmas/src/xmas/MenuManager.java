package xmas;

import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String MemberName = new String();
		int NumAccept = 0;
		
		while(true) {
			System.out.println("1. Add Member");
			System.out.println("2. Delete Member");
			System.out.println("3. Edit Member");
			System.out.println("4. View Member");
			System.out.println("5. Menu");
			System.out.println("6. Exit");
			String a = input.next();
			char str = a.charAt(0);
			if(str == '1') {
				System.out.println("메뉴로 나가시려면 0을, 회원 입력을 계속하시려면 1을 입력하십시오: ");
				NumAccept = input.nextInt();				
				if(NumAccept == 0) continue;
				else if(NumAccept == 1) {
					MemberName = input.next();
					continue;
				}
			}
			else if(str == '2') {
				System.out.println("회원 정보를 삭제하시려면 1을, 메뉴로 나가시려면 0을 입력하세요:");
				NumAccept = input.nextInt();
				if(NumAccept == 0) continue;
				else if(NumAccept == 1) {
					MemberName = "empty";
					System.out.println(MemberName);
					continue;
				}
			}
			else if(str == '3') {
				//추후 구현 필요 , 구조체를 이용하여 회원 정보를 저장하고 묶어서 보여줌
			}
			else if(str == '4') {
				System.out.println(MemberName);
			}
			else if(str == '5') {
				continue;
			}
			else if(str == '6') break;
		}
		
		
		
	}

}
