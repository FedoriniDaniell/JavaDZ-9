package org.example;

public class Radio {
    private int currentStationRadio;
    private int currentVolume;

    public int getCurrentStationRadio() {
        return currentStationRadio;
    }

    public void setCurrentStationRadio(int currentStationRadio) {
        if (currentStationRadio > 9) {
            return;
        }
        if (currentStationRadio < 0) {
            return;
        }
        this.currentStationRadio = currentStationRadio;
    }

    public void next() {
        if (currentStationRadio == 9) {
            currentStationRadio = 0;
        } else {
            currentStationRadio++;
        }
    }


    public void prev() {
        if (currentStationRadio == 0) {
            currentStationRadio = 9;
        } else {
            currentStationRadio--;
        }
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 100) {
            return;
        }
        if (currentVolume < 0) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }
}
