package eleven;

import java.util.Random;

class ThreadD extends Thread {

	String name;
	int count;
	int sum;
	Random random;

	public ThreadD(String name, int count) {
		this.name = name;
		this.count = count;
		this.sum = 0;
		this.random = new Random();
	}

	@Override
	public void run() {
		System.out.printf("%s: started\n", name);
		try {
			for (int i = 1; i <= count; ++i) {
				sum = sum + i;
				int mili_second = random.nextInt(10);
				sleep(mili_second);
			}
		} catch (InterruptedException e) {
			System.out.printf("%s: interrupted\n", name);
		}
		System.out.printf("%s: stoped\n", name);
	}
}

public class Example05 {

	public static void main(String args[]) {
		System.out.println("main started");
		ThreadD threadOne = new ThreadD("one", 100);
		ThreadD threadTwo = new ThreadD("two", 100);
		ThreadD threadThree = new ThreadD("three", 100);
		threadOne.start();
		threadTwo.start();
		threadThree.start();

		try {
			threadOne.join();
			threadTwo.join();
			threadThree.join();
		} catch (InterruptedException e) {
			System.out.println("interrupted");
		}
		// join(): 그 스레드의 실행흐름이 run 메소드를 리턴하여 종료될때까지
		// 			main 메소드는 대기하다가 리턴한다.

		System.out.printf("one: %d\n", threadOne.sum);
		System.out.printf("two: %d\n", threadTwo.sum);
		System.out.printf("three: %d\n", threadThree.sum);
		System.out.println("main stoped");
	}
}