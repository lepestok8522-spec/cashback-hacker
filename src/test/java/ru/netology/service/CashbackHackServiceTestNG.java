package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTestNG {

    @Test
    public void testRemainForAmountLessThanBoundary() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(900);
        int expected = 100;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testRemainForExactBoundary() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testRemainForMoreThanBoundary() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1350);

        int expected = 650;
        Assert.assertEquals(actual, expected);
    }

    // Этот тест должен упасть из-за ошибки в коде
    @Test
    public void testRemainWhenAmountIsMultipleOfBoundary() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(2000);

        int expected = 0;
        Assert.assertEquals(actual, expected);
    }
}