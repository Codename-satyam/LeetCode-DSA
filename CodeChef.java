import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        while (x-- > 0) {
            int n = sc.nextInt();
            sc.nextLine();
            String input = sc.nextLine();
            char[] arr = input.toCharArray();
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (count >= 4) {
                    break;
                }
                if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {
                    count = 0;
                } else {
                    count++;
                }
            }
            if (count == 4) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
