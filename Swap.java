import java.util.*;
import java.lang.*;
import java.io.*;

class Swap
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t--<0){
		    int n=sc.nextInt();
		    int count=0;
		    int count1=0;
		    for(int i=0;i<n;i++){
		        String x=sc.nextLine();
		        String y=sc.nextLine();
		        
		        char arr[]=x.toCharArray();
		        char arr1[]=x.toCharArray();
		        
		        for(int j=0;j<n;j++){
		            if(arr[i]=='0'){
		                count++;
		            }
		            if(arr1[i]=='0'){
		                count1++;
		            }
		        }
		        
		        if(count==count1){
		            System.out.println("YES");
		        }else{
		            System.out.println("NO");
		        }
		    }
		}
	}
}
