import java.util.Stack;

class maximal {
    public static void main(String args[]) {
        int[] apart = { 2, 1, 5, 6, 2, 3 };
        int result[] = new int[apart.length];
        int result2[] = new int[apart.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = apart.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && apart[stack.peek()] >= apart[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                result[i] = apart.length;
            } else {
                result[i] = stack.peek();
            }
            stack.push(i);
        }
        for(int i=0;i<result.length;i++){
            System.out.print(result[i] + " ");
        }

        System.out.println();
        for (int i = 0; i < apart.length; i++) {
            while (!stack.isEmpty() && apart[stack.peek()] >= apart[i]) {
                int top = stack.pop();
            }
            if (stack.isEmpty()) {
                result2[i] = -1;
            } else {
                result2[i] = stack.peek();
            }
            stack.push(i);
        }
        for (int i = 0; i < result2.length; i++) {
            System.out.print(result2[i] + " ");
        }

        int area = 0;
        for (int i = 0; i < apart.length; i++) {
            int width = result[i] - result2[i] - 1;
            area = Math.max(area, apart[i] * width);
        }
        System.out.println();
        System.out.println("Maximal Rectangle Area: " + area);
    }
}