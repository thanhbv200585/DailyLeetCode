import java.util.ArrayList;
import java.util.List;

public class MaxVowels {
    public static void main(String[] args) {
        String s = "weallloveyou";
        int k = 7;
        System.out.println(maxVowels(s, k));
    }

    public static int maxVowels(String nums, int k) {
        List<Character> vowels = new ArrayList<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        int count = 0;
        int[] isVowel = new int[nums.length()];
        for (int i = 0; i < nums.length(); i++) {
            char c = nums.charAt(i);
            if (vowels.contains(c)) {
                isVowel[i] = 1;
            } else {
                isVowel[i] = 0;
            }
        }

        for (int i = 0; i < k; i++) {
            count += isVowel[i];
        }

        int max = count;
        for (int i = k; i < nums.length(); i++) {
            count = count + isVowel[i] - isVowel[i - k];

            if (count > max) {
                max = count;
            }
        }

        return Math.min(max, k);
    }
}
