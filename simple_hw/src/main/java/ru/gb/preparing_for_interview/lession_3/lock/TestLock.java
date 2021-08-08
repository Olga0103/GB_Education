package ru.gb.preparing_for_interview.lession_3.lock;


public class TestLock {

    public static void main(String[] args) {
        SyncLock counter = new SyncLock();
        new Thread(counter::inc).start();
        new Thread(counter::dec).start();
        new Thread(() -> System.out.println(counter.get())).start();
        new Thread(counter::inc).start();
    }
}
