package B.B_2667;

import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	static int n;
	static boolean[][] visited = new boolean[26][26];
	static int[][] arr = new int[26][26];
	static int[] gogoA = { 0, 1, 0, -1 };
	static int[] gogoB = { 1, 0, -1, 0 };
	static int cccnntt = 0;

	public static void dangi(int a, int b) {
		visited[a][b] = true;
		cccnntt++;

		for (int i = 0; i < 4; i++) {
			int A = a + gogoA[i];
			int B = b + gogoB[i];

			if (A >= 0 && A < n && B >= 0 && B < n)
				if (visited[A][B] == false && arr[A][B] == 1)
					dangi(A, B);
		}
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < n; i++) {
			String s = sc.nextLine();
			char[] c = s.toCharArray();
			for (int j = 0; j < s.length(); j++) {
				if (c[j] == '0')
					arr[i][j] = 0;
				else
					arr[i][j] = 1;
			}
		}

		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		int cnt = 0;
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				if (visited[i][j] == false && arr[i][j] == 1) {
					cccnntt = 0;
					cnt++;
					dangi(i, j);
					pq.add(cccnntt);
				}

		System.out.println(cnt);
		
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
	}
}