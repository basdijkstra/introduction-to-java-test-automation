package unittests.examples;

public class Calculator {

    private int total;

    public Calculator() {
        this.total = 0;
    }

    public int getTotal() {

        return this.total;
    }

    public void add(int numberToAdd) {

        this.total += numberToAdd;
    }

    public void subtract(int numberToSubtract) {

        this.total -= numberToSubtract;
    }
}
