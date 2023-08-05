package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RadioTest {
    @Test
    public void setCurrentStationRadio() {
        Radio radio = new Radio();
        radio.setCurrentStationRadio(7);
        int actual = radio.getCurrentStationRadio();
        int expected = 7;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStationRadioOver9() {
        Radio radio = new Radio();
        radio.setCurrentStationRadio(7);
        radio.setCurrentStationRadio(10);
        int actual = radio.getCurrentStationRadio();
        int expected = 7;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStationRadioBellow_0() {
        Radio radio = new Radio();
        radio.setCurrentStationRadio(7);
        radio.setCurrentStationRadio(-1);
        int actual = radio.getCurrentStationRadio();
        int expected = 7;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NextRegular() {
        Radio radio = new Radio();
        radio.setCurrentStationRadio(7);
        radio.next();
        int actual = radio.getCurrentStationRadio();
        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NextAfterNine() {
        Radio radio = new Radio();
        radio.setCurrentStationRadio(9);
        radio.next();
        int actual = radio.getCurrentStationRadio();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void PrefRegular() {
        Radio radio = new Radio();
        radio.setCurrentStationRadio(7);
        radio.prev();
        int actual = radio.getCurrentStationRadio();
        int expected = 6;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void PrefPreviousZero() {
        Radio radio = new Radio();
        radio.setCurrentStationRadio(0);
        radio.prev();
        int actual = radio.getCurrentStationRadio();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestSetVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(55);

        int actual = radio.getCurrentVolume();
        int expected = 55;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestSetVolumeOver100() {
        Radio radio = new Radio();
        radio.setCurrentVolume(55);
        radio.setCurrentVolume(101);


        int actual = radio.getCurrentVolume();
        int expected = 55;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestSetVolumeZero() {
        Radio radio = new Radio();
        radio.setCurrentVolume(55);
        radio.setCurrentVolume(-1);

        int actual = radio.getCurrentVolume();
        int expected = 55;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestIncreaseVolumeOver100() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.increaseVolume();


        int actual = radio.getCurrentVolume();
        int expected = 100;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestDecreaseVolumeZero() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestIncreaseVolumeRegular() {
        Radio radio = new Radio();

        radio.setCurrentVolume(55);
        radio.increaseVolume();


        int actual = radio.getCurrentVolume();
        int expected = 56;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestDecreaseVolumeRegular() {
        Radio radio = new Radio();

        radio.setCurrentVolume(55);
        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 54;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestDecreaseVolumeBellowZero() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }


}