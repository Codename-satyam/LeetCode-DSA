import java.util.Scanner;
class Rotated{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int x=sc.nextInt();
        int left = 0;
        int right = n - 1;

        while(left <= right){
            int mid=left + (right - left) / 2;
            if(arr[mid] == x){
                System.out.println(mid);
                break;
            }else if(arr[left] <= arr[mid]){
                if(arr[left]<=x && x<arr[mid]){
                    right= mid - 1;
                }else{
                    left = mid + 1;
                }
            }else{
                if(arr[mid] < x && x <= arr[right]){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }
        }
    }
}