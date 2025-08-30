package Lec7Strings;

public class StringCompression {
    public static void main(String[] args) {
        String s = "AAABBCDDDD";
        StringBuilder result = new StringBuilder();

        int count = 1; // bộ đếm số lần xuất hiện
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++; // nếu ký tự giống ký tự trước thì tăng đếm
            } else {
                // thêm ký tự + số lần đếm vào kết quả
                result.append(s.charAt(i - 1)).append(count);
                count = 1; // reset bộ đếm
            }
        }

        // xử lý ký tự cuối cùng
        result.append(s.charAt(s.length() - 1)).append(count);

        System.out.println(result.toString());
    }
}
 