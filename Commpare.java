import java.util.Scanner;

public class Commpare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); 

        while (n-- > 0) {
            int size = sc.nextInt();
            sc.nextLine(); 

            String x = sc.nextLine();
            String y = sc.nextLine();

            char arr1[] = x.toCharArray();
            char arr2[] = y.toCharArray();

            int count = 0;
            int count1 = 0;

            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] == '0') {
                    count++;
                }
            }
            for (int i = 0; i < arr2.length; i++) {
                if (arr2[i] == '0') {
                    count1++;
                }
            }
            if (count == count1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
