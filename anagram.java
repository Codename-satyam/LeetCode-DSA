import java.util.HashMap;

public class anagram {
    public static void main(String[] args) {
        String str1 = "car";
        String str2 = "cat";

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (map1.containsKey(ch)) {
                map1.put(ch, map1.get(ch) + 1);
            } else {
                map1.put(ch, 1);
            }
        }

        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);
            if (map2.containsKey(ch)) {
                map2.put(ch, map2.get(ch) + 1);
            } else {
                map2.put(ch, 1);
            }
        }

        boolean isAnagram = true;
        if (map1.size() != map2.size()) {
            isAnagram = false;
        } else {
            for (char ch : map1.keySet()) {
                if (!map2.containsKey(ch) || !map1.get(ch).equals(map2.get(ch))) {
                    isAnagram = false;
                    break;
                }
            }
        }

        if (isAnagram) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }
}
