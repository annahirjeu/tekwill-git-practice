package org.library;

public class AudioBook extends LibraryItem {
    private int durationInSeconds;

    public int getDurationInS() {
        return durationInSeconds;
    }

    public void setDurationInS(int durationInS) {
        this.durationInSeconds = durationInS;
    }
}

