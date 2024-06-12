package ch12;

public class CountThreadConsole {

	static public void main(String [] args) {

	
			System.out.println("메인 실행 시작>>");

			Thread th1 = new Thread(new CountThread());	
			th1.start();
			
			for(int i=1; i<=30; i++)
				System.out.print("<" + i + "> ");
			System.out.println("메인 실행 끝>>");

			return;

	}
}

class CountThread extends Thread {  
	@Override
	public void run() {
		System.out.println("스레드 실행 시작");		
		for(int i=1; i<=30; i++)
			System.out.print(i + " ");
		System.out.println();
		System.out.println("스레드 종료");
	}
}
