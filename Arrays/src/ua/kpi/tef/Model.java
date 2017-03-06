package ua.kpi.tef;

/**
 * Created by Віталій on 05.03.2017.
 */

public class Model {
    private int []arr;

    public Model(int []arr) {
        this.arr = arr;
    }

    public int[] getArr() {
        return this.arr;
    }

    public int howArray() {
        int count = 0;
        int result = 0;
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) count++;
        }
        if (count == arr.length) result = 1;
        if (count < arr.length && count > 0) result = 2;
        if (count == 0) result = -1;
        return result;
    }
}