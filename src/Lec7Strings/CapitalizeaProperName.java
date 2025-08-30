package Lec7Strings;

public class CapitalizeaProperName {

    public static void main(String[] args) {
        String s = "ngUYen vAn a";
        
        // Xóa khoảng trắng đầu và cuối 
        String n = s.trim();
        
        // Tách thành mảng từ theo khoảng trắng
        String[] words = n.split("\\s+");
         
        // Dùng StringBuilder để ghép kết quả
        StringBuilder result = new StringBuilder();
        
        for (String word : words) {
            // Chữ cái đầu viết hoa, các chữ còn lại viết thường
            String normalized = word.substring(0, 1).toUpperCase() +
                               word.substring(1).toLowerCase();
            result.append(normalized).append(" ");
        }
        
        // In ra, trim() để bỏ dấu cách thừa cuối chuỗi
        System.out.println(result.toString().trim());
    }
}
