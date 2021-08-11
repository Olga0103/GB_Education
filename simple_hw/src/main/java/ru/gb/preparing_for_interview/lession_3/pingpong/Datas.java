package ru.gb.preparing_for_interview.lession_3.pingpong;

public class Datas {

    private static boolean busy;

    public void start() {
        new Thread(this::printPing).start();
        new Thread(this::printPong).start();
    }


    public synchronized void printPing() {
        while (true) {
            try {
                if (busy) {
                    wait();
                }
                System.out.println("Ping");
                busy = true;
                Thread.sleep(1000);
                notify();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void printPong() {
        while (true) {
            try {
                if (!busy) {
                    wait();
                }
                System.out.println("Pong");
                busy = false;
                Thread.sleep(1000);
                notify();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
