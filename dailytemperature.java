import java.util.Stack;

class dailytemperature{
    public static void main(String args[]){
        int arr[] = {73, 74, 75, 71, 69, 72, 76, 73};
        int result[] = new int[arr.length];
        int n = arr.length;
        Stack<Integer> stack = new Stack<>();

        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty () && arr[stack.peek()] <= arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                result[i]=0;
            }else{
                result[i] = stack.peek()-i;
            }
            stack.push(i);
        }
        for(int i=0;i<n;i++){
            System.out.print(result[i] + " ");
        }
        
    }
}