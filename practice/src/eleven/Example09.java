package eleven;

import java.util.Random;

class SharedObjB {
	int sum = 0;

	synchronized void add(int i) { // synchronized
		sum = sum + i;
	} // 어느 한 순간 하나의 스레드만 이 객체의 메소드를 호출할 수 있다.
}

class ThreadJ extends Thread {

	String name;
	int count;
	SharedObjB sharedObj;
	Random random;

	public ThreadJ(String name, int count, SharedObjB sharedObj) {
		this.name = name;
		this.count = count;
		this.sharedObj = sharedObj;
		this.random = new Random();
	}

	@Override
	public void run() {
		System.out.printf("%s: started\n", name);
		try {
			for (int i = 1; i <= count; ++i) {
				sharedObj.add(i);
				int mili_second = random.nextInt(10);
				sleep(mili_second);
			}
		} catch (InterruptedException e) {
			System.out.printf("%s: interrupted\n", name);
		}
		System.out.printf("%s: stoped\n", name);
		System.out.printf("%s: %d\n", name, sharedObj.sum);
	}
}

public class Example09 {

	public static void main(String args[]) {
		SharedObjB sharedObj = new SharedObjB();
		ThreadJ threadOne = new ThreadJ("one", 100, sharedObj);
		ThreadJ threadTwo = new ThreadJ("two", 100, sharedObj);
		ThreadJ threadThree = new ThreadJ("three", 100, sharedObj);
		threadOne.start();
		threadTwo.start();
		threadThree.start();
	}
}