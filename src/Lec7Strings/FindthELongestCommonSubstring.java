
package Lec7Strings;

public class FindthELongestCommonSubstring {
       public static String findLCS(String str1, String str2) {
            String longestCommon = "";
            // Tạo tất cả chuỗi con của chuỗi thứ nhất
            for (int i = 0; i < str1.length(); i++) {
                for (int j = i + 1; j <= str1.length(); j++) {
                    String substring = str1.substring(i, j);

                    // Kiểm tra xem chuỗi con có trong chuỗi thứ hai không
                    // và có dài hơn chuỗi con chung dài nhất hiện tại không
                    if (str2.contains(substring) && substring.length() > longestCommon.length()) {
                        longestCommon = substring;
                    }
                }
            }
            return longestCommon;
        }

        public static void main(String[] args) {
            String s1 = "ABCDEF";
            String s2 = "XBCYDEFZ";
            String lcs = findLCS(s1, s2);
            System.out.println("Chuỗi con chung dài nhất là: " + lcs); // Output: CDEF

            String s3 = "JavaProgramming";
            String s4 = "PythonProgramming";
            lcs = findLCS(s3, s4);
            System.out.println("Chuỗi con chung dài nhất là: " + lcs); // Output: Programming
        }
}