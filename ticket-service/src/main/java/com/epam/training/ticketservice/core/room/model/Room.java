package com.epam.training.ticketservice.core.room.model;

import com.epam.training.ticketservice.core.pricing.Pricing;

public class Room {
    private String name;
    private int rows;
    private int cols;
    private Pricing pricing;

    private Room(String name, int rows, int cols, Pricing pricing){
        this.name = name;
        this.rows = rows;
        this.cols = cols;
        this.pricing = pricing;
    }
}
