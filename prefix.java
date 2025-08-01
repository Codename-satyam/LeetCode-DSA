import java.util.Stack;
import java.util.Scanner;

public class prefix {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();  
        String word = "prefix";
        Scanner sc = new Scanner(System.in);
        char x = sc.next().charAt(0);
        int z = -1;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == x) {
                z = i;
            }
        }
        if (z == -1) {
            System.out.println(word);
            return;
        }
        for (int i = 0; i <= z; i++) {
            stack.push(word.charAt(i));
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        sb.append(word.substring(z));
        System.out.println(sb.toString());
    }
}
