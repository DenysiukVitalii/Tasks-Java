package ua.kpi.tef;

/**
 * Created by Віталій on 07.03.2017.
 */
public class Model {
    private int value;

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public int rand() {
        return (int) (Math.random() * 100);
    }

    public boolean isCompare(int val, int rand) {
        return val == rand;
    }

    public int lowerOrUpper(int val, int rand) {
        if (val == rand) return 0;
        return (val > rand) ? -1 : 1;
    }
}
