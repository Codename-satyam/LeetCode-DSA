import java.util.*;

public class test1{
    public static void main(String[] args) {
        int[] arr = {2,1,5,6,2,3};
        int[] result = new int[arr.length];
        Stack<Integer> stack = new Stack<>(); // store indices

        for (int i = 0; i < arr.length; i++) {
            // Pop elements that are greater than or equal to current
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }

            // If stack is empty, no smaller element to the left
            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek(); // Index of nearest smaller to the left
            }

            stack.push(i); // Push current index to stack
        }

        // Print result
        for (int pos : result) {
            System.out.print(pos + " ");
        }
    }
}
