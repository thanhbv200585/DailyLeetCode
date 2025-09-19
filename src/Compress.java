public class Compress {
    public int compress(char[] chars) {
        if (chars == null || chars.length == 0)
            return 0;

        char c0 = chars[0];
        String s = "" + c0;
        int lenGroup = 0;

        for (char c : chars) {
            if (c0 == c) {
                lenGroup++;
            } else {
                if (lenGroup > 1) {
                    s += String.valueOf(lenGroup);
                }
                c0 = c;
                s += c0;
                lenGroup = 1;
            }
        }

        // Add the last group count
        if (lenGroup > 1) {
            s += String.valueOf(lenGroup);
        }
        chars = s.toCharArray();
        return s.length();
    }

}
