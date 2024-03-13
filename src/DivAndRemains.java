package ch02;

import java.util.Scanner;

public class DivAndRemains {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("3자리수 정수 입력(100~999)>>");
		int n = scanner.nextInt();
		if(n < 100 || n > 999) {
			System.out.println("100~999 사이의 정수만 입력하세요.");
	//		scanner.close();
			return;
		}
		int h = n/100;
		int t = n%100;
		int o = t%10;
		
		if(h == o)
			System.out.println("Yes! 100의 자리와 1의 자리가 같습니다.");
		else
			System.out.println("No! 100의 자리와 1의 자리가 다릅니다.");			
//		scanner.close();
	}

}
