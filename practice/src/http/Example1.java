package http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Example1 {
	public static void main(String[] args) throws Exception {

		String listUrl = "http://www.skhu.ac.kr/board/boardlist.aspx?curpage=1&bsid=10004&searchBun=51";
		String html = getHttpResponse(listUrl);

		System.out.println(html);
	}

	// 웹서버에 url을 요청하고, 그 결과를 리턴하는 메소드
	static String getHttpResponse(String url) throws IOException {
		URL urlObj = new URL(url);
		HttpURLConnection connection = (HttpURLConnection) urlObj.openConnection();

		connection.setRequestMethod("GET");
		connection.setRequestProperty("User-Agent", "Mozilla/5.0");

		String contentType = connection.getContentType();
		String encoding = (contentType.toUpperCase().indexOf("UTF-8") >= 0) ? "UTF-8" : "EUC-KR";
		StringBuffer builder = new StringBuffer();
		try (BufferedReader input = new BufferedReader(new InputStreamReader(connection.getInputStream(), encoding))) {
			String s;
			while ((s = input.readLine()) != null) {
				builder.append(s);
				builder.append('\n');
			}
		}
		return builder.toString();
	}
}