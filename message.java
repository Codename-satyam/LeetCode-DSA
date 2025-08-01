import java.util.Scanner;

class message{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            sc.nextLine();
            String input=sc.nextLine();
            char temp;
            char arr[]=input.toCharArray();
            for(int i=0;i<n-1;i+=2){
                temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
            for(int i=0;i<n;i++){
                if(arr[i]>='a' && arr[i]<='z'){
                    arr[i]=(char)('z'-(arr[i]-'a'));
                } 
            }
            System.out.println(new String(arr));
            
        }
    }
}