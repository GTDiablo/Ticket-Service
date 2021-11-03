package com.epam.training.ticketservice.core.screening.model;

import com.epam.training.ticketservice.core.movie.model.Movie;
import com.epam.training.ticketservice.core.room.model.Room;

import java.util.Date;

public class Screening {
    private Movie movie;
    private Room room;
    private Date date;

    private Screening(Movie movie, Room room, Date date){
        this.movie = movie;
        this.room = room;
        this.date = date;
    }

}
