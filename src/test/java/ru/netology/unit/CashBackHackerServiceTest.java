package ru.netology.unit;

import static org.testng.Assert.*;

import org.testng.Assert;
import org.testng.annotations.Test;



public class CashBackHackerServiceTest {
    @Test
    public void amount900() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);

        Assert.assertEquals(actual, expected);

    }

    @Test
    public void amount850() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 850;
        int expected = 150;
        int actual = service.remain(amount);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void amount999() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 999;
        int expected = 1;
        int actual = service.remain(amount);

        Assert.assertEquals(actual, expected);


    }
    @Test
    public void amount1000() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);

        Assert.assertEquals(actual, expected);


    }
    @Test
    public void amount1000_1() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 1000;
        int expected = 1000;
        int actual = service.remain(amount);

        Assert.assertEquals(actual, expected);


    }
}