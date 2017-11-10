package org.headfirst.patterns;

/**
 * Created by mikhail on 01.11.17.
 */
public class DvdPlayer {
    public void play(String movie) {
        System.out.println("DVD Player plays " + movie);
    }

    public void on() {
        System.out.println("DVD Player on");
    }

    public void off() {
        System.out.println("DVD Player off");
    }

    public void eject() {
        System.out.println("DVD Player ejecting");
    }

    public void stop() {
        System.out.println("DVD Player stopping");
    }


}
