package com.epam.training.ticketservice.core.booking.model;

import com.epam.training.ticketservice.core.screening.model.Screening;

import java.util.Collections;
import java.util.List;

public class Booking {
    private Screening screening;
    private List<BookedSeat> seats;

    Booking(Screening screening, List<BookedSeat> seats){
        this.screening = screening;
        this.seats = seats;
    }

    Booking(Screening screening){
        this.screening = screening;
        this.seats = Collections.emptyList();
    }

    public Screening getScreening() {
        return screening;
    }

    public List<BookedSeat> getSeats() {
        return seats;
    }
}
