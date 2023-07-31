package ru.netology.service;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService hackService = new CashbackHackService();

    //Тесты на JUnit4

    @Test
    public void ShouldHackAmount1000() {

        int amount = 0;

        int actual = hackService.remain(amount);
        int expected = 1000;

        assertEquals(expected, actual);
    }

    @Test
    public void ShouldHackAmount500() {
        int amount = 500;

        int actual = hackService.remain(amount);
        int expected = 500;

        assertEquals(expected, actual);
    }

    @Test
    public void ShouldHackAmount1() {
        int amount = 999;

        int actual = hackService.remain(amount);
        int expected = 1;

        assertEquals(expected, actual);
    }


    @Test
    public void ShouldHackAmount0() {
        int amount = 1000;

        int actual = hackService.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }


    @Test
    public void ShouldHackAmount999() {
        int amount = 1001;

        int actual = hackService.remain(amount);
        int expected = 999;

        assertEquals(expected, actual);
    }

    //Тесты на JUnit Jupiter

    @Test
    public void ShouldHackAmount1000Jupiter() {

        int amount = 0;

        int actual = hackService.remain(amount);
        int expected = 1000;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void ShouldHackAmount500Jupiter() {
        int amount = 500;

        int actual = hackService.remain(amount);
        int expected = 500;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldHackAmount1Jupiter() {
        int amount = 999;

        int actual = hackService.remain(amount);
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void ShouldHackAmount0Jupiter() {
        int amount = 1000;

        int actual = hackService.remain(amount);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void ShouldHackAmount999Jupiter() {
        int amount = 1001;

        int actual = hackService.remain(amount);
        int expected = 999;

        Assertions.assertEquals(expected, actual);
    }
}
