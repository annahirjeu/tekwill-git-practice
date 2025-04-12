package org.library;

import java.util.Date;

public class ReservationService {
    Reservation[] reservations = new Reservation[100];
    int counter = 0;

    public void reserve(Person person, LibraryItem libraryItem) {
        Reservation reservation = new Reservation(new Date(), person, libraryItem);
        reservations[counter] = reservation;
        counter++;
    }

}
