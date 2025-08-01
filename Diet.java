import java.util.Scanner;

class Diet{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int z=0;
            int count=0;

            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            for(int i=0;i<arr.length;i++){
                if((arr[i]+z)>k){
                    z=arr[i]-k;
                    count++;
                }
            }
            if(count==arr.length){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}