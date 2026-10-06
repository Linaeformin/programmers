import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        // 메서드 isUpperCase, toUpperCase 사용
        // String 객체를 Char 배열로 변환 후 실행
        for (char c : str.toCharArray()) {
            // Character은 class
            if (Character.isUpperCase(c)){
                System.out.print(Character.toLowerCase(c));
            }
            else if (Character.isLowerCase(c)){
                System.out.print(Character.toUpperCase(c));
            }
            else continue;
        }
    }
}