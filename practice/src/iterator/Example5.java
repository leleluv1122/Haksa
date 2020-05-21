package iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

// 역방향 탐색
// previousIndex(): 이전 데이터 항목으로 현재 위치를 이동후 그 데이터 항목 인덱스 리턴
public class Example5 {
	public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < 10; ++i)
            list.add(i);
        
        for (int i = list.size() - 1; i >= 0; --i)
            System.out.print(list.get(i) + " ");
        
        System.out.println();

        ListIterator<Integer> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()) {
            Integer i = iterator.previous();
            System.out.print(i + " ");
        }
    }

}
