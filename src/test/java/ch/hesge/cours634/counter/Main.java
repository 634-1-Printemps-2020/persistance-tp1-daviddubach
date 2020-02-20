package ch.hesge.cours634.counter;

public class Main {

    public static void main(String[] args) throws CounterException{
         // Tests counter
        System.out.println("Counter ---------");
        Counter c = new Counter(0);
        System.out.println(c.getValue() + " (base)");
        c.inc();
        System.out.println(c.getValue() + " (inc)");
        c.add(10);
        System.out.println(c.getValue() + " (add 10)");
        c.add(-4);
        System.out.println(c.getValue() + " (sou 4)");

        // Tests counter limited
        System.out.println("Counter limited ---------");
        UpperLimitedPositiveCounter cLimited = new UpperLimitedPositiveCounter(0, 6);
        System.out.println(cLimited.getValue() + " (base)");
        cLimited.inc();
        System.out.println(cLimited.getValue() + " (inc)");
        cLimited.add(4);
        System.out.println(cLimited.getValue() + " (add 4)");
        cLimited.add(3);
        System.out.println(cLimited.getValue() + " (add 3)");
    }
}
