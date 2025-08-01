import java.util.HashMap;
class missing{
    public static void main(String args[]){
        HashMap<Integer, Integer> map = new HashMap<>();
        int ar[] = {1,2,2,3,1,4};
        for(int i=0; i<ar.length; i++){
            if(map.containsKey(ar[i])){
                map.put(ar[i], map.get(ar[i]) + 1);
            } else {
                map.put(ar[i], 1);
            }   
        }
        int n=0;
        for(int freq:map.values()){
            if(freq>n){
                n = freq;
            }
        }
        int sum=0;
        for(int freq: map.values()){
            if(freq==n){
                sum += freq;
            }
        }
        System.out.println("The sum of the most frequent elements is: " + sum);
    }
}