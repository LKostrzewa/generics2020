package pl.p.lodz.zzpj2020.generics.task1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pl.p.lodz.zzpj2020.generics.task1.model.OneWayList;
import pl.p.lodz.zzpj2020.generics.task1.model.Step;

public class OneWayListStepTest {
    private OneWayList<Step> stepOneWayList = new OneWayList<>();

    @Before
    public void prepare() {
        stepOneWayList.add(new Step("step1"));
        stepOneWayList.add(new Step("step2"));
    }

    @Test
    public void addTest() {
        Assert.assertFalse(stepOneWayList.isEmpty());
        Assert.assertEquals(stepOneWayList.getSize(), 2);
    }

    @Test
    public void clearTest() {
        stepOneWayList.clear();

        Assert.assertTrue(stepOneWayList.isEmpty());
        Assert.assertEquals(stepOneWayList.getSize(), 0);
    }

    @Test
    public void getTest() {
        stepOneWayList.add(new Step("step3"));


        Assert.assertEquals(stepOneWayList.getElement(1).getDescription(), "step2");
        Assert.assertEquals(stepOneWayList.getElement(2).getDescription(), "step3");
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void emptyGetTest() {
        stepOneWayList.clear();
        stepOneWayList.getElement(0);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void outOfBoundGetTest() {
        stepOneWayList.getElement(3);
    }
}