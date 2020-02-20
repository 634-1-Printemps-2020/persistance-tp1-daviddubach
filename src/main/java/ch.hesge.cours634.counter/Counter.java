package ch.hesge.cours634.counter;

public class Counter implements ICounter {
    int initial;

    public Counter(int initial) {
        this.initial = initial;
    }

    public void inc() throws CounterException {
        add(1);
    }

    public void add(int step) throws CounterException {
        this.initial += step;
    }

    public int getValue() {
        return this.initial;
    }
}
