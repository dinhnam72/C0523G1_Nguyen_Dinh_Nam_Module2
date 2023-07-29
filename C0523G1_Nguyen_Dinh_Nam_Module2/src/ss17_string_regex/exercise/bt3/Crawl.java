package ss17_string_regex.exercise.bt3;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Crawl {
    private static final String URL_PATTERN = "<a href=\"(.*?)\">(.*?)</a>";

    public static void main(String[] args) throws IOException {
        // Lấy URL của trang tin tức
        URL url = new URL("https://dantri.com.vn/the-gioi.htm");

        // Mở kết nối tới URL
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        // Đọc HTML từ kết nối
        InputStream inputStream = connection.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

        StringBuilder str = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            str.append(line);
        }

        String html = str.toString();

        // Tìm tất cả các liên kết trong HTML
        Pattern pattern = Pattern.compile(URL_PATTERN);
        Matcher matcher = pattern.matcher(html);


        // Tạo danh sách liên kết
        List<String> links = new ArrayList<>();
        while (matcher.find()) {
            links.add(matcher.group(1));
        }

        // In các liên kết đến bảng điều khiển
        PrintWriter writer = new PrintWriter(System.out);
        for (String link : links) {
            writer.println(link);
        }

        writer.close();
    }
}
