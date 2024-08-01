package org.java8.examples;

public class ThreadOddEvenNumber {
    private final Object lock=new Object();
    private  int count=1;
    private final int limit;

    public ThreadOddEvenNumber(int limit) {
        this.limit = limit;
    }
    public void printOdd()
    {
        synchronized (lock){
            while(count<limit)
            {
                while(count % 2==0)
                {
                    try {
                        lock.wait();
                    }catch (InterruptedException e)
                    {
                        Thread.currentThread().interrupt();
                    }
                }
                System.out.println("Odd : " + count);
                count++;
                lock.notify();
            }
        }
    }
    public void printEven()
    {
        synchronized (lock){
            while(count<=limit)
            {
                while(count % 2!=0)
                {
                    try {
                        lock.wait();
                    }catch (InterruptedException e)
                    {
                        Thread.currentThread().interrupt();
                    }
                }
                System.out.println("Even : " + count);
                count++;
                lock.notify();
            }
        }
    }

    public static void main(String[] args) {
        ThreadOddEvenNumber printer=new ThreadOddEvenNumber(10);

        Thread t1=new Thread(printer::printOdd);
        Thread t2=new Thread(printer::printEven);

        t1.start();
        t2.start();
    }
}
