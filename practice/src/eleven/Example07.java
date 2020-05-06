package eleven;

import java.util.Random;

class ThreadF extends Thread {

	String name;
	int count;
	static int sum = 0;
	Random random;

	public ThreadF(String name, int count) {
		this.name = name;
		this.count = count;
		this.random = new Random();
	}

	@Override
	public void run() {
		System.out.printf("%s: started\n", name);
		try {
			for (int i = 1; i <= count; ++i) {
				synchronized (ThreadF.class) {
					sum = sum + i;
				}
				// synchronized (ThreadF.class) {
				// 여러 쓰레드가 공유하는 변수를 읽고쓸때는 rock이 필요하다
				int mili_second = random.nextInt(10);
				sleep(mili_second);
			}
		} catch (InterruptedException e) {
			System.out.printf("%s: interrupted\n", name);
		}
		System.out.printf("%s: stoped\n", name);
		System.out.printf("%s: %d\n", name, sum);
	}
}

public class Example07 {

	public static void main(String args[]) {
		ThreadF threadOne = new ThreadF("one", 100);
		ThreadF threadTwo = new ThreadF("two", 100);
		ThreadF threadThree = new ThreadF("three", 100);
		threadOne.start();
		threadTwo.start();
		threadThree.start();
	}
}