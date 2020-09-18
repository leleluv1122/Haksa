package B.B_9093;

import java.io.*;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Stack<Character> st = new Stack<Character>();
		String input = "";

		String nStr = br.readLine();
		int n = Integer.parseInt(nStr);

		for (int i = 0; i < n; i++) {
			input = br.readLine();
			input += "\n";
			StringBuilder sb = new StringBuilder("");

			for (int j = 0; j < input.length(); j++) {
				if (input.charAt(j) == ' ' || input.charAt(j) == '\n') {
					while (!st.empty())
						sb.append(st.pop());
				}

				if (input.charAt(j) == ' ')
					sb.append(input.charAt(j));
			}
			bw.write(sb.toString() + "\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
