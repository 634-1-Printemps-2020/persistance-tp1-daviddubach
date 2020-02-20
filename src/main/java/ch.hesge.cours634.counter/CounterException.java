package ch.hesge.cours634.counter;

public class CounterException extends Exception{

    @Override
    public String getMessage() {
        return super.getMessage() + " ! 0 < limitedCounter < max";
    }
}
