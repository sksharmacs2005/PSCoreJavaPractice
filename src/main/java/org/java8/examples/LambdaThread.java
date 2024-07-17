package org.java8.examples;

public class LambdaThread {
    public static void main(String[] args) {

        Runnable runnable=()->
        {

            for(int i=1;i<=10;i++)
            {
                System.out.println("Hello : " + i);
                try{
                    Thread.sleep(1000);
                }catch (InterruptedException e)
                {
                    System.out.println("Thread Interrupted !!");
                }
            }
        };
        Thread thread=new Thread(runnable);
        thread.start();
    }
}
