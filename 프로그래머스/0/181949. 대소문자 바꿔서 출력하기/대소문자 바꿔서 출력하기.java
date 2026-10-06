import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        for (char c : str.toCharArray()) {
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