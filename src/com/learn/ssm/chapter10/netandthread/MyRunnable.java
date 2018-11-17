package com.learn.ssm.chapter10.netandthread;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        go();
    }

    private void go() {
        try {
            System.out.println(Thread.currentThread().getName() + Thread.currentThread().getState());
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getState());
        } catch (Exception e) {
            e.printStackTrace();
        }
        doMore();
    }

    private void doMore() {
        System.out.println("top o' the stack");
    }
}

class ThreadTestDriver {
    public static void main(String[] args) throws InterruptedException {
        Runnable threadJob = new MyRunnable();
        Thread myThread = new Thread(threadJob);
        System.out.println("isDaemon: " + myThread.isDaemon());
        System.out.println("isAlive: " + myThread.isAlive());
        System.out.println(myThread.getState());
        myThread.start();
        System.out.println("isAlive: " + myThread.isAlive());
        System.out.println(myThread.getState());
        System.out.println("back in main");
    }
}