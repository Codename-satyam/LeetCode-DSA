import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Majority {
    public List<Integer> majorityElement(int[] nums){
        List<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> countMap = new HashMap<>();
        int n = nums.length;

        for(int i=0;i<n;i++){
            if(countMap.containsKey(countMap.get(nums[i]))) {
                countMap.put(nums[i], countMap.get(nums[i]) + 1);
            } else {
                countMap.put(nums[i], 1);
            }
        }
        int x=n/3;
        for(int key : countMap.keySet()){
            if(countMap.get(key) > x){
                result.add(key);
            }
        }
        return result;
        
    }
}
