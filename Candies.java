import java.util.*;

class Candies {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int x = sc.nextInt();
            int[] arr = new int[2 * x];

            for (int j = 0; j < 2 * x; j++) {
                arr[j] = sc.nextInt();
            }

            Arrays.sort(arr);
            int flag=0;
            for(int j=0;j<2*x-2;j++){
                if(arr[j]==arr[j+1] && arr[j+1]==arr[j+2]){
                    System.out.println("No");
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.println("Yes");
            }
        }
    }
}
