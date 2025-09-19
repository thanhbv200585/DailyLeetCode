import java.util.*;

public class ReverseVowels {
    public String reverseVowels(String s) {
        List<Character> vowels = new ArrayList<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');

        List<Character> vowelList = new ArrayList<>();
        List<Integer> indexList = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (vowels.contains(s.charAt(i))) {
                vowelList.add(s.charAt(i));
                indexList.add(i);
            }
        }
        int size = vowelList.size();
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < vowelList.size(); i++) {
            sb.setCharAt(indexList.get(size - 1 - i), vowelList.get(i));
        }
        return sb.toString();
    }
}
