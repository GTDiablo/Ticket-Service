package com.epam.training.ticketservice.core.movie.model;

public class Movie {
    private String name;
    private MovieCategory category;
    private int duration;

    private Movie(String name, MovieCategory category, int duration){
        this.name = name;
        this.category = category;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    public MovieCategory getCategory() {
        return category;
    }

    class Builder{
        private String name = "";
        private MovieCategory category = MovieCategory.NONE;
        private int duration = 0;

        public void setName(String name) {
            this.name = name;
        }

        public void setCategory(MovieCategory category) {
            this.category = category;
        }

        public void setDuration(int duration) {
            this.duration = duration;
        }

        public Movie build(){
            return new Movie(this.name, this.category, this.duration);
        }
    }
}
