package ua.kpi.tef;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Віталій on 06.03.2017.
 */
public class ModelTest {
    @Test
    public void getArr() throws Exception {
        int[] a = {5,1,2,6,4,2,6,8,1,10};
        Model model = new Model(a);
        assertEquals(a, model.getArr());
    }

    @Test
    public void howArray() throws Exception {
        int[] positive = {5,1,2,6,4,2,6,8,1,10};
        int[] negative = {-5,-1,-2,-6,-4,-2,-6,-8,-1,-10};
        int[] pos_n_neg = {5,-1,2,-6,4,-2,6,-8,1,10};

        Model model1 = new Model(positive);
        Model model2 = new Model(negative);
        Model model3 = new Model(pos_n_neg);

        assertEquals(1, model1.howArray());
        assertEquals(-1, model2.howArray());
        assertEquals(2, model3.howArray());
    }

}