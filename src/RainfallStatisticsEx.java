package ch07;

import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class RainfallStatisticsEx {
/*	
	public static void print(Vector<Integer> v) {
		int sum = 0;
		Iterator<Integer> it = v.iterator();
		while(it.hasNext()) {
			int n = it.next();
			System.out.print(n + " ");
			sum += n;
		}
		System.out.println();
		System.out.println("현재 평균 " + sum/v.size());		
		
	}
*/
	static void printList(Vector<String> l) { // 리스트의 요소를 모두 출력하는 메소드
		Iterator<String> iterator = l.iterator(); // Iterator 객체 리턴
		while (iterator.hasNext()) { // Iterator 객체에 요소가 있을 때까지 반복
				String e = iterator.next(); // 다음 요소 리턴
				String separator;
				if (iterator.hasNext())
						separator = "->"; // 마지막 요소가 아니면 → 출력
				else
						separator = "\n"; // 마지막 요소이면 줄바꿈
				System.out.print(e+separator);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Vector<String> v = new Vector<String>();
		while(true) {
			System.out.print("이름 입력 (그만 입력시 종료)>> ");
			String n = scanner.next();
			if(n.equals("그만")) 
				break;
			v.add(n);
			
		}
		System.out.println("입력한 값 : " + v);
		System.out.println("첫번째 인덱스 추가할 이름 입력 ==> ");
		String n = scanner.next();
		v.add(1, n);
		System.out.println("삽입한 값 : " + v);
		
		Collections.sort(v);  // 요소 정렬
		System.out.print("오름차순 정렬 값 : ");
		printList(v); // 정렬된 요소 출력
		
		Collections.reverse(v);  // 요소의 순서를 반대로 구성
		System.out.print("내림차순 정렬 값 : ");
		printList(v); // 요소 출력

	//	scanner.close();
	}
	
}
