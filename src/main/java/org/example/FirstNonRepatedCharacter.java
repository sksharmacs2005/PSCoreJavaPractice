package org.example;

public class FirstNonRepatedCharacter {
    public static void main(String[] args) {

        String str="Sujeet Sharma";
        System.out.println("First Non Reapated Character = " + getFirstNonRepatCharacter(str));
    }
    private static Character getFirstNonRepatCharacter(String str)
    {
        return str.chars().filter(c->str.indexOf(c) == str.lastIndexOf(c)).mapToObj(c->(char)c)
                .findFirst().orElse(null);
    }
}
