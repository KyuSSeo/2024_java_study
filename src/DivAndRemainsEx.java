package ch02;

import java.util.Scanner;

public class DivAndRemainsEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("2자리수 정수 입력(10~99)>>");
		int n = scanner.nextInt();
		if(n < 10 || n > 99) {
			System.out.println("10~99 사이의 정수만 입력하세요.");
			scanner.close();
			return;
		}
		int ten = n/10;
		int one = n%10;
		
		if(ten == one)
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
		else
			System.out.println("No! 10의 자리와 1의 자리가 다릅니다.");			
//		scanner.close();
	}

}
