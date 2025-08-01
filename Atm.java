import java.util.Scanner;

class Atm{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int y=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(y>=arr[i]){
                System.out.println(1);
                y-=arr[i];
            }else{
                System.out.println(0);
            }
        }
    }
}