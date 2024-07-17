package org.java8.examples;

public class SequentialOddEven {

    private static final int MAX = 10;
    private int count = 1;
    private final Object lock = new Object();

    private void printOdd() {
        synchronized (lock) {
            while (count < MAX) {
                if (count % 2 == 0) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                } else {
                    System.out.print(count + " ");
                    count++;
                    lock.notify();
                }
            }
        }
    }

    private void printEven() {
        synchronized (lock) {
            while (count <= MAX) {
                if (count % 2 == 1) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                } else {
                    System.out.print(count + " ");
                    count++;
                    lock.notify();
                }
            }
        }
    }

    private static class OddRunnable implements Runnable {
        private final SequentialOddEven seq;

        OddRunnable(SequentialOddEven seq) {
            this.seq = seq;
        }

        @Override
        public void run() {
            seq.printOdd();
        }
    }

    private static class EvenRunnable implements Runnable {
        private final SequentialOddEven seq;

        EvenRunnable(SequentialOddEven seq) {
            this.seq = seq;
        }

        @Override
        public void run() {
            seq.printEven();
        }
    }
    public static void main(String[] args) {
        SequentialOddEven seq = new SequentialOddEven();

        Thread oddThread = new Thread(new OddRunnable(seq));
        Thread evenThread = new Thread(new EvenRunnable(seq));

        oddThread.start();
        evenThread.start();
    }
}