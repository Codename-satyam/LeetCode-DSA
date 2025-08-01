// User function Template for Java
import java.util.HashSet;
class firstrepeating{
    public static void main(String args[]){
        String word = "hellogeeks";
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(set.contains(ch)){
                System.out.println(ch);
                break;
            }else{
                set.add(ch);
            }
        }
    }
}