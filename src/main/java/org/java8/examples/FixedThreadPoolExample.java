package org.java8.examples;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPoolExample {
    public static void main(String[] args) {

        ExecutorService executor= Executors.newFixedThreadPool(3);
        for(int i=0;i<=5;i++)
        {
            final int taskId=i;
            executor.submit(()->{
                System.out.println("The TaskId" + taskId + " by thread " + Thread.currentThread().getName());

                try{
                    Thread.sleep(5000);
                }catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            });
        }
executor.shutdown();
    }
}
