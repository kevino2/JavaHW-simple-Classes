public class Calculator {
    private int value1;
    private int value2;
}

    public Calculator(int value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public int add
            () {
        return this.value1 + this.value2;
    }

    public int subtract
            () {
        return this.value1 - this.value2;
    }

    public int multiply
            () {
        return this.value1 * this.value2;
    }

    public double divide
            () {
        return this.value1 / this.value2;
    }
}