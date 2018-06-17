package com.example.matbook.ca1;

public class Blocker extends GameElement {
    private int missPenalty; // the miss penalty for this Blocker

    // constructor
    public Blocker(CannonView view, int color, int missPenalty, int x,
                   int y, int width, int length, float velocityY) {
        super(view, color, CannonView.BLOCKER_SOUND_ID, x, y, width, length,
                velocityY);
        this.missPenalty = missPenalty;
    }

    // returns the miss penalty for this Blocker
    public int getMissPenalty() {
        return missPenalty;
    }
}