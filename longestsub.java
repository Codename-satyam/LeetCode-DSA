import java.util.Arrays;
class longestsub{
    public static void main(String args[]){
        int arr[]={100,4,200,1,3,2};
        int n=arr.length;
        if(n==0){
            System.out.println("0");
            return;
        }
        Arrays.sort(arr);
        int max=1;
        int count=1;
        for(int i=1;i<n;i++){
            if(arr[i]==arr[i-1]){
                continue;
            }
            if(arr[i]-arr[i-1]==1){
                count++;
                max=Math.max(count,max);
            }else{
                count=1;
            }
        }
        System.out.println(max);

    }
}