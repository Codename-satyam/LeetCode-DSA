import java.util.HashMap;

class WordPattern {
    public static void main(String[] args) {
        String pattern = "abba";
        String str = "dog cat cat dog";

        String[] words = str.split(" ");

        if (pattern.length() != words.length) {
            System.out.println("The pattern and string do not match.");
            return;
        }

        HashMap<Character, String> charToWord = new HashMap<>();
        HashMap<String, Character> wordToChar = new HashMap<>();

        boolean isMatch = true;

        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String word = words[i];

            if (charToWord.containsKey(ch)) {
                if (!charToWord.get(ch).equals(word)) {
                    isMatch = false;
                    break;
                }
            } else {
                charToWord.put(ch, word);
            }

            if (wordToChar.containsKey(word)) {
                if (wordToChar.get(word) != ch) {
                    isMatch = false;
                    break;
                }
            } else {
                wordToChar.put(word, ch);
            }
        }

        if (isMatch) {
            System.out.println("The pattern and string match.");
        } else {
            System.out.println("The pattern and string do not match.");
        }
    }
}
