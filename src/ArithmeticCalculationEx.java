package ch02;

import java.util.Scanner;

public class ArithmeticCalculationEx {

	public static void main(String[] args) {
		double a,b,c,n,root;
		double x1,x2;
		
		System.out.print("이차방정식 ax^2 + bx + c 의 근을 구합니다.");
		Scanner scanner = new Scanner(System.in);
		System.out.print("이차항 계수 (a) 값을 입력하세요>>");
		a = scanner.nextInt();
		System.out.print("이차항 계수 (b) 값을 입력하세요>>");
		b = scanner.nextInt();
		System.out.print("상수항 (c) 값을 입력하세요>>");
		c = scanner.nextInt();
		
		n = (b*b)-(4*a*c);
		root = Math.sqrt(n);
		
		if (n == 0)
			x1=(-b+root)/(2*a);
			System.out.print("이차방정식의 근은"+x1+"입니다.");
		if (n > 0)
			x1=(-b+root)/(2*a);
			x2=(-b-root)/(2*a);
			System.out.print("이차방정식의 근은"+x1+"와"+x2+"두개 입니다.");
		if (n < 0)
			System.out.print("이차방정식의 근은 없습니다.");
		
	//	b^2-4ac
	//	scanner.close();
	}

}
