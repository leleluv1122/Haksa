package iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

// iterator는 현재위치라는 개념.
// hasNext(): 아직 탐색할 데이터가 남아잇으면 true 끝났으면 false를 return
// next(): 다음 데이터 항목으로 현재 위치 이동후, 그 데이터항목 return
// 		   현재 위치가 이미 끝이라면 예외발생
// remove(): 현재위치의 데이터 제거
//  	     직전의 next() 메소드 호출에서 return된 데이터 제거

public class Example1 {
	public static void main(String[] args) {
		Collection<Integer> c = new ArrayList<Integer>();

		for (int i = 0; i < 10; ++i)
			c.add(i);

		for (Integer i : c)
			System.out.print(i + " ");

		System.out.println();

		Iterator<Integer> iterator = c.iterator();
		while (iterator.hasNext()) {
			Integer i = iterator.next();
			System.out.print(i + " ");
		}
	}
}
