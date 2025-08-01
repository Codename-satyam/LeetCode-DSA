class getSum {
    public static void main(String args[]) {
        int a = -1;
        int b = 1;

        while (b > 0) {
            if (a > 0) {
                int carry = a & b;
                a = a ^ b;
                b = carry << 1;
            } else {
                a = b;
                b = 0;
                if (a < 0) {
                    break; 
                }
            }
        }
        System.out.println("Sum: " + a);
    }
}