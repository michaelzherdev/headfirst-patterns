package org.headfirst.patterns;

/**
 * Created by mikhail on 01.11.17.
 */
public class HomeTheaterTestDrive {

    public static void main(String[] args) {
            Amplifier amplifier = new Amplifier();
            CdPlayer cdPlayer = new CdPlayer();
            DvdPlayer dvdPlayer = new DvdPlayer();
            PopcornPopper popper = new PopcornPopper();
            Projector projector = new Projector();
            Screen screen = new Screen();
            TheaterLights lights = new TheaterLights();
            Tuner tuner = new Tuner();

            HomeTheaterFacade homeTheater = new HomeTheaterFacade(amplifier, tuner,
                    dvdPlayer,cdPlayer,projector,lights,screen,popper);
            homeTheater.watchMovie("Inception");
            homeTheater.endMovie();
    }
}
