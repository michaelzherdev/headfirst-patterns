package org.headfirst.patterns;

/**
 * Created by mikhail on 01.11.17.
 */
public class Amplifier {

    private int volume;

    public void on() {
        System.out.println("Amplifier on");
    }

    public void setDvd(DvdPlayer dvd) {
        System.out.println("Amplifier setting DVD Player to " + dvd);
    }

    public void setSurroundSound() {
        System.out.println("Amplifier setting surrounding sound");
    }

    public void setVolume(int volume) {
        System.out.println("Amplifier setting volume to " + volume);
        this.volume = volume;
    }

    public void off() {
        System.out.println("Amplifier off");
    }
}
