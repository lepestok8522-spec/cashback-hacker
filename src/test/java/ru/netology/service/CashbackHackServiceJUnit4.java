package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceJUnit4 {

    @Test
    public void testRemainForAmountLessThanBoundary() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(900);
        int expected = 100;
        Assert.assertEquals("Неверный расчёт остатка", expected, actual);
    }

    @Test
    public void testRemainForExactBoundary() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemainForMoreThanBoundary() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1350);
        int expected = 650;
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testRemainWhenAmountIsMultipleOfBoundary() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(2000);

        int expected = 0;
        Assert.assertEquals(expected, actual);
    }
}