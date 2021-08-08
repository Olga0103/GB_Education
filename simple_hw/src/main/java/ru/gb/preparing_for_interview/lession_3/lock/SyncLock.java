package ru.gb.preparing_for_interview.lession_3.lock;

import edu.emory.mathcs.backport.java.util.concurrent.locks.Lock;
import edu.emory.mathcs.backport.java.util.concurrent.locks.ReentrantLock;



public class SyncLock {

    private int counter;
    Lock lock;

    public SyncLock() {
        this.lock = new ReentrantLock();
    }

    public int get() {
        lock.lock();
        try {
            return counter;
        } finally {
            lock.unlock();
        }
    }

    public void inc() {
        lock.lock();
        try {
            counter++;
        } finally {
            lock.unlock();
        }
    }

    public void dec() {
        lock.lock();
        try {
            counter--;
        } finally {
            lock.unlock();
        }
    }
}
