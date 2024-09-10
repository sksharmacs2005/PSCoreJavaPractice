package org.java8.examples;
public class EncodeString {
    public static String encode(String str) {
        int n = str.length();
        StringBuilder encoded = new StringBuilder();

        for (int i = 0; i < n; i++) {
            encoded.append(str.charAt(i));
            int repeatLength = checkRepeat(str, i + 1, encoded.toString());
            if (repeatLength > 0) {
                encoded.append("*");
                i += repeatLength - 1;
            }
        }
        return encoded.toString();
    }

    private static int checkRepeat(String str, int startIndex, String pattern) {
        int patternLength = pattern.length();
        int i;
        for (i = startIndex; i + patternLength <= str.length(); i += patternLength) {
            if (!str.substring(i, i + patternLength).equals(pattern)) {
                return 0;
            }
        }
        return i - startIndex;
    }

    public static void main(String[] args) {
        String str1 = "ABABCABABCE";
        String str2 = "ABCABCABCABC";
        String str3 = "ABCABCABC";

        System.out.println("Encoded str1 => ABABCABABCE = : " + encode(str1)); // Expected output: ABAB*C*E
        System.out.println("Encoded str2 => ABCABCABCABC = : " + encode(str2)); // Expected output: ABC**
        System.out.println("Encoded str3 => ABCABCABC = : " + encode(str3)); // Expected output: ABC*ABC
    }

}
