import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // System.out.println(a + " + " + b + " = " + (a + b));
        
        // 아래 코드는 포맷팅
        System.out.printf("%d + %d = %d", a, b, a + b);
    }
}