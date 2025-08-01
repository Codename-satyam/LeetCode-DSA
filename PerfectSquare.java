import java.util.Scanner;
class PerfectSquare{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int left=0;
        int right=n;
        while(left<=right){
            int mid = left + (right - left) / 2;
            int square = mid * mid;
            if (square == n){
                System.out.println("YES");
                return;
            }
            else if (square < n){
                left = mid + 1;
            }
            else if(square > n){
                right = mid - 1;
            }
        }
        System.out.println("NO");
    }
}