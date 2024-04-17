package ch07;

import java.util.Scanner;
import java.util.Vector;

public class VectorBigEx {

	public static void printBig(Vector<Integer> v) {  // 벡터 v의 정수 중 가장 큰 수 출력
		int big = v.get(0); // 맨 처음에 있는 수를 제일 큰 수로 초기화
		System.out.println("벡터의 내용은 " + v);
		for(int i=1; i<v.size(); i++) {
			if(big > v.get(i))  // 더 큰 수 발견
				big = v.get(i); // big 변수 교체
		}
		
		System.out.println("가장 작은 수는 " + big);
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("삭제하고자 하는 수는 >> ");
		int del = scanner.nextInt();
		boolean b = false;
		for(int i=0; i<v.size(); i++) {
			if(del ==  v.get(i)) { // 더 큰 수 발견
				b = true;
				del = i;
				break;
			}
		}
		if (b != false) 
			v.remove(del);	
		else 
			System.out.println(del + " 은 벡터에 존재하지 않습니다.");	
		v.sort(null);	
		System.out.println("오름차순 벡터의 내용은 " + v);		
	}
	
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수(-1이 입력될 때까지)>> ");
		while(true) {
			int n = scanner.nextInt();
			if(n == -1) // 입력된 수가 -1이면
				break;
			v.add(n);
		}
		
		if(v.size() == 0) {
			System.out.print("수가 하나도 없음");
	//		scanner.close();
			return;
		}
		
		printBig(v); // 벡터 v의 정수 중 가장 큰 수 출력
	//	scanner.close();
	}
}
