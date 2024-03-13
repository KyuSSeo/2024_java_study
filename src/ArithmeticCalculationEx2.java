package ch02;

import java.util.Scanner;

public class ArithmeticCalculationEx {

	public static void main(String[] args) {
		double a,b,c;
		double determinant;
		double root;
		double x1,x2;

		Scanner Sc =new Scanner(System.in);
		System.out.println("이차방정식(ax^2+bx+c=0꼴)의 근을 구해주는 프로그램입니다.");
		System.out.print("이차항 계수(a)를 입력하세요");
		a=Sc.nextInt();

		System.out.print("이차항 계수(b)를 입력하세요");
		b=Sc.nextInt();

		System.out.print("상수항(c)를 입력하세요");
		c=Sc.nextInt();

		determinant=(b*b)-(4*a*c);
		root = Math.sqrt(determinant);/////root를 계산하는 명령어

		if(determinant>0){
			x1=(-b+root)/(2*a);
			x2=(-b-root)/(2*a);
			System.out.println("이차방정식의 근은 " + x1+" 과"+x2+" 두개입니다.");
		}

		if(determinant==0){
			x1=(-b+root)/(2*a);
			System.out.println("이차방정식의 근은 중근으로, "+x1+"입니다.");
		}

		if(determinant<0){
			System.out.println("이차방정식의 근이 없습니다.");
		}

	}
}
