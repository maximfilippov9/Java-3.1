package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void nextStation1() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        int currentStation = radio.nextStation();
        assertEquals(1, currentStation);
    }

    @Test
    public void nextStation2() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        int currentStation = radio.nextStation();
        assertEquals(2, currentStation);
    }

    @Test
    public void nextStation3() {
        Radio radio = new Radio();
        radio.setCurrentStation(2);
        int currentStation = radio.nextStation();
        assertEquals(3, currentStation);
    }

    @Test
    public void nextStation4() {
        Radio radio = new Radio();
        radio.setCurrentStation(3);
        int currentStation = radio.nextStation();
        assertEquals(4, currentStation);
    }

    @Test
    public void nextStation5() {
        Radio radio = new Radio();
        radio.setCurrentStation(4);
        int currentStation = radio.nextStation();
        assertEquals(5, currentStation);
    }

    @Test
    public void nextStation6() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        int currentStation = radio.nextStation();
        assertEquals(6, currentStation);
    }

    @Test
    public void nextStation7() {
        Radio radio = new Radio();
        radio.setCurrentStation(6);
        int currentStation = radio.nextStation();
        assertEquals(7, currentStation);
    }

    @Test
    public void nextStation8() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);
        int currentStation = radio.nextStation();
        assertEquals(8, currentStation);
    }

    @Test
    public void nextStation9() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        int currentStation = radio.nextStation();
        assertEquals(9, currentStation);
    }

    @Test
    public void nextStation10() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        int currentStation = radio.nextStation();
        assertEquals(0, currentStation);
    }

    @Test
    public void nextStation11() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        int currentStation = radio.nextStation();
        assertEquals(1, currentStation);
    }

    @Test
    public void prevStation1() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        int currentStation = radio.prevStation();
        assertEquals(9, currentStation);
    }

    @Test
    public void prevStation2() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        int currentStation = radio.prevStation();
        assertEquals(8, currentStation);
    }

    @Test
    public void prevStation3() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        int currentStation = radio.prevStation();
        assertEquals(7, currentStation);
    }

    @Test
    public void prevStation4() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);
        int currentStation = radio.prevStation();
        assertEquals(6, currentStation);
    }

    @Test
    public void prevStation5() {
        Radio radio = new Radio();
        radio.setCurrentStation(6);
        int currentStation = radio.prevStation();
        assertEquals(5, currentStation);
    }

    @Test
    public void prevStation6() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        int currentStation = radio.prevStation();
        assertEquals(4, currentStation);
    }

    @Test
    public void prevStation7() {
        Radio radio = new Radio();
        radio.setCurrentStation(4);
        int currentStation = radio.prevStation();
        assertEquals(3, currentStation);
    }

    @Test
    public void prevStation8() {
        Radio radio = new Radio();
        radio.setCurrentStation(3);
        int currentStation = radio.prevStation();
        assertEquals(2, currentStation);
    }

    @Test
    public void prevStation9() {
        Radio radio = new Radio();
        radio.setCurrentStation(2);
        int currentStation = radio.prevStation();
        assertEquals(1, currentStation);
    }

    @Test
    public void prevStation10() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        int currentStation = radio.prevStation();
        assertEquals(0, currentStation);
    }

    @Test
    public void prevStation11() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        int currentStation = radio.prevStation();
        assertEquals(9, currentStation);
    }

    @Test
    public void prevStation12() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        int currentStation = radio.prevStation();
        assertEquals(9, currentStation);
    }

    @Test
    public void increaseVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        int currentVolume = radio.increaseVolume();
        assertEquals(1, currentVolume);
    }

    @Test
    public void increaseVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        int currentVolume = radio.increaseVolume();
        assertEquals(2, currentVolume);
    }

    @Test
    public void increaseVolume3() {
        Radio radio = new Radio();
        radio.setCurrentVolume(2);
        int currentVolume = radio.increaseVolume();
        assertEquals(3, currentVolume);
    }

    @Test
    public void increaseVolume4() {
        Radio radio = new Radio();
        radio.setCurrentVolume(3);
        int currentVolume = radio.increaseVolume();
        assertEquals(4, currentVolume);
    }

    @Test
    public void increaseVolume5() {
        Radio radio = new Radio();
        radio.setCurrentVolume(4);
        int currentVolume = radio.increaseVolume();
        assertEquals(5, currentVolume);
    }

    @Test
    public void increaseVolume6() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        int currentVolume = radio.increaseVolume();
        assertEquals(6, currentVolume);
    }

    @Test
    public void increaseVolume7() {
        Radio radio = new Radio();
        radio.setCurrentVolume(6);
        int currentVolume = radio.increaseVolume();
        assertEquals(7, currentVolume);
    }

    @Test
    public void increaseVolume8() {
        Radio radio = new Radio();
        radio.setCurrentVolume(7);
        int currentVolume = radio.increaseVolume();
        assertEquals(8, currentVolume);
    }

    @Test
    public void increaseVolume9() {
        Radio radio = new Radio();
        radio.setCurrentVolume(8);
        int currentVolume = radio.increaseVolume();
        assertEquals(9, currentVolume);
    }

    @Test
    public void increaseVolume10() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        int currentVolume = radio.increaseVolume();
        assertEquals(10, currentVolume);
    }

    @Test
    public void increaseVolume11() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        int currentVolume = radio.increaseVolume();
        assertEquals(10, currentVolume);
    }

    @Test
    public void increaseVolume12() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        int currentVolume = radio.increaseVolume();
        assertEquals(1, currentVolume);
    }

    @Test
    public void reduceVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        int currentVolume = radio.reduceVolume();
        assertEquals(9, currentVolume);
    }

    @Test
    public void reduceVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        int currentVolume = radio.reduceVolume();
        assertEquals(8, currentVolume);
    }

    @Test
    public void reduceVolume3() {
        Radio radio = new Radio();
        radio.setCurrentVolume(8);
        int currentVolume = radio.reduceVolume();
        assertEquals(7, currentVolume);
    }

    @Test
    public void reduceVolume4() {
        Radio radio = new Radio();
        radio.setCurrentVolume(7);
        int currentVolume = radio.reduceVolume();
        assertEquals(6, currentVolume);
    }

    @Test
    public void reduceVolume5() {
        Radio radio = new Radio();
        radio.setCurrentVolume(6);
        int currentVolume = radio.reduceVolume();
        assertEquals(5, currentVolume);
    }

    @Test
    public void reduceVolume6() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        int currentVolume = radio.reduceVolume();
        assertEquals(4, currentVolume);
    }

    @Test
    public void reduceVolume7() {
        Radio radio = new Radio();
        radio.setCurrentVolume(4);
        int currentVolume = radio.reduceVolume();
        assertEquals(3, currentVolume);
    }

    @Test
    public void reduceVolume8() {
        Radio radio = new Radio();
        radio.setCurrentVolume(3);
        int currentVolume = radio.reduceVolume();
        assertEquals(2, currentVolume);
    }

    @Test
    public void reduceVolume9() {
        Radio radio = new Radio();
        radio.setCurrentVolume(2);
        int currentVolume = radio.reduceVolume();
        assertEquals(1, currentVolume);
    }

    @Test
    public void reduceVolume10() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        int currentVolume = radio.reduceVolume();
        assertEquals(0, currentVolume);
    }

    @Test
    public void reduceVolume11() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        int currentVolume = radio.reduceVolume();
        assertEquals(0, currentVolume);
    }

    @Test
    public void reduceVolume12() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int currentVolume = radio.reduceVolume();
        assertEquals(0, currentVolume);
    }


}