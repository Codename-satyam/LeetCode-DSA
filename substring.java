import java.util.HashSet;
class substring{
    public static void main(String[] args) {
        String str= "abcabcbb";
        HashSet<Character> set = new HashSet<>();
        int maxLength = 0;

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(set.contains(ch)){
                break;
            }else{
                set.add(ch);
                maxLength = Math.max(maxLength, set.size());
            }
        }
        System.out.println(set.size());
    }
}