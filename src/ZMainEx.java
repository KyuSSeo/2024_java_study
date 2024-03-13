package ch02;



import java.util.Scanner;

public class ZMainEx {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("============================================");
			System.out.println("	1 : 1번 원본,	101 : 1번 수정");
			System.out.println("	2 : 2번 원본,	102 : 2번 수정");
			System.out.println("	3 : 3번 원본,	103 : 3번 수정");
			System.out.println("	4 : 4번 원본,	104 : 4번 수정");
			System.out.println("	5 : 5번 원본,	105 : 5번 수정");
			System.out.println("	6 : 6번 원본,	106 : 6번 수정");
			System.out.println("	7 : 7번 원본,	107 : 7번 수정");
			System.out.println("   이외의 수 :	종료");
			System.out.println("============================================");
			int num = scanner.nextInt();
			scanner.nextLine();
			switch (num) {
				case 1:
					Addtion.main(args);	//1번 원본
					break;
				case 101:
					AddtionEx.main(args);	//1번 수정
					break;
				case 2:
					DivAndRemains.main(args);	//2번 원본
					break;
				case 102:
					DivAndRemainsEx.main(args);	//2번 수정
					break;
				case 3:
		//			3.main(args);	//3번 원본
					break;
				case 103:
		//			3Ex.main(args);	//3번 수정
					break;	
				case 4:
		//			4.main(args);	//4번 원본
					break;
				case 104:
		//			4Ex.main(args);	//4번 수정
					break;					
				case 5:
		//			5.main(args);	//5번 원본
					break;
				case 105:
		//			5Ex.main(args);	//5번 수정
					break;
				case 6:
		//			6.main(args);	//6번 원본
					break;
				case 106:
		//			6Ex.main(args);	//6번 수정
					break;						
				case 7:
		//			7.main(args);	//7번 원본
					break;
				case 107:
		//			7Ex.main(args);	//7번 수정
					break;
				default :
					System.out.println("<< ...끝... >>");
					return;
			}
		}
	}
}
