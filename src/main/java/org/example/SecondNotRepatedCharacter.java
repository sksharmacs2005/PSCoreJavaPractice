package org.example;

public class SecondNotRepatedCharacter {
    public static void main(String[] args) {

        String str="Sujeet Sharma";
        System.out.println("2nd non repated character = " + getSecondChar(str));
    }
    private static Character getSecondChar(String str)
    {
        return str.chars().filter(c->str.indexOf(c)== str.lastIndexOf(c))
                .mapToObj(c->(char)c).skip(1).findFirst().orElse(null);
    }
}
