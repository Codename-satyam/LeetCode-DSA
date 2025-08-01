import java.util.HashMap;

class longestsubstring{
    public static void main(String[] args) {
        String s = "abcabcbb";
        HashMap<Character, Integer> map = new HashMap<>();
        int maxLength = 0;
        int start = 0;  
        for(int i=0;i<s.length();i++){
            char currentChar = s.charAt(i);
            if(map.containsKey(currentChar) && map.get(currentChar) >= start) {
                start = map.get(currentChar) + 1; 
            }
            map.put(currentChar, i); 
            maxLength = Math.max(maxLength, i - start + 1); 
        }
        System.out.println(maxLength);
    }
}