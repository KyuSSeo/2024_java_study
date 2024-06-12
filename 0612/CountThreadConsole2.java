package ch12;

public class CountThreadConsole2 {

	static public void main(String [] args) {
	
			System.out.println("메인 실행 시작>>");

			CountThread2 th1 = new CountThread2();	
			th1.run2();
			
			for(int i=1; i<=30; i++)
				System.out.print("<" + i + "> ");
			System.out.println("메인 실행 끝>>");

			return;

	}
}

class CountThread2 {  

	public void run2() {
		System.out.println("스레드 실행 시작");		
		for(int i=1; i<=30; i++)
			System.out.print(i + " ");
		System.out.println();
		System.out.println("스레드 종료");
	}
}
