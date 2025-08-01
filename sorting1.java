class Solution {
    public void sort012(int[] arr) {
        int count=0;
        int count1=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                count++;
            }
            if(arr[i]==1){
                count1++;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(i<count){
                arr[i]=0;
            }
            for(int j=count;j<arr.length;j++){
                if(j<count1+count){
                    arr[j]=1;
                }
                else{
                    arr[j]=2;
                }
            }
        }
    }
}