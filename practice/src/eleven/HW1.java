package eleven;

import java.util.Random;

class SharedObjC {
	int sum = 0;

	synchronized void add(int i) {
		sum += i;
	}
	
	synchronized void sub(int i) {
		sum -= i;
	}
}

class ThreadN extends Thread {
	String name;
	int count;
	SharedObjC sharedObj;
	Random random;
	char c;

	public ThreadN(String name, int count, SharedObjC sharedObj, char c) {
		this.name = name;
		this.count = count;
		this.sharedObj = sharedObj;
		this.random = new Random();
		this.c = c;
	}

	@Override
	public void run() {
		System.out.printf("%s: started\n", name);
		try {
			if(c == 'd') {
				for (int i = 1; i <= count; i++) {
					sharedObj.add(i);
					int mili_second = random.nextInt(10);
					sleep(mili_second);
				}
			}
			else if (c == 'b') {
				for (int i = 1; i <= count; i++) {
					sharedObj.sub(i);
					int mili_second = random.nextInt(10);
					sleep(mili_second);
				}
			}
			
		} catch (InterruptedException e) {
			System.out.printf("%s: interrupted\n", name);
		}
		System.out.printf("%s: stoped\n", name);
		System.out.printf("%s: %d\n", name, sharedObj.sum);
	}
}

public class HW1 {
	public static void main(String args[]) {
		SharedObjC sharedObj = new SharedObjC();
		ThreadN threadOne = new ThreadN("one", 100, sharedObj ,'d'); //add
		ThreadN threadTwo = new ThreadN("two", 100, sharedObj, 'b'); //sub
		threadOne.start();
		threadTwo.start();
	}
}