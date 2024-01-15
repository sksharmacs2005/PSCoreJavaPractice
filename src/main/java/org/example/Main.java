package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world! Sujeet");

        String s1="Java";
        String s2=new String("Java");
        String s3="Java";
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1==s3);

        int x=10;
        double y=3.2;
        char z='A';
        String str="Hello,World!";
        System.out.println("x = " + x +  " = y= " + y + " = z = " + z);

        for(int i=0;i<10;i=i++)
        {
            i+=1;
            System.out.println(i+ "Java");
        }
        int b=2;
        int result=Add(b);
        System.out.println(result);
    }


    public static int Add(int x)
    {
        int y=4;
        return x+y;

    }
}