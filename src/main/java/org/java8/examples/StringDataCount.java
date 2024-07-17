package org.java8.examples;

public class StringDataCount {
    public static void main(String[] args) {
        String str1="aabbbcaaddddggggef";
        String str2="a2b3c1a2d4g4e1f1";

        String dataresult = getDataresult(str1);

        System.out.println(dataresult);
    }
    private static String getDataresult(String input)
    {
        StringBuilder result = new StringBuilder();

        int count = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                result.append(input.charAt(i - 1)).append(count);
                count = 1;
            }
        }
        result.append(input.charAt(input.length() - 1)).append(count);

        //System.out.println(result.toString()); // Output: a2b3c1a2d4g4e1f1
     return result.toString();
    }
}
