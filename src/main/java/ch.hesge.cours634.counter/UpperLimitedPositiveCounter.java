package ch.hesge.cours634.counter;

public class UpperLimitedPositiveCounter extends Counter{
    int max;

    public UpperLimitedPositiveCounter(int initial, int max) {
        super(initial);
        this.max = max;
    }


    @Override
    public void add(int step) throws CounterException {
        int tmp = this.initial;
        tmp += step;
        if((tmp >= this.max) || tmp < 0){
            throw new CounterException();
        }
        super.add(step);
    }
}
