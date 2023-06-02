package Java_Seminar8_CW.Sample2;

import javax.swing.*;

public class Track extends Obstacle {

    private final int length;

    public Track(int length) {
        this.length = length;
    }

    @Override
    public int getLength() {
        return length;
    }

    @Override
    public int getHeight() {
        return 0;
    }
}
