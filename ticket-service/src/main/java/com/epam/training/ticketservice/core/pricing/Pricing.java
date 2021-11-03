package com.epam.training.ticketservice.core.pricing;

public class Pricing {
    private static int DEFAULT_PRICE = 1500;

    private String name;
    private int price;

    private Pricing(String name, int price){
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    static public int getDefaultPrice(){
        return DEFAULT_PRICE;
    }

    static public Pricing getDefaultPriceInstance(){
        return new Pricing("DEFAULT", getDefaultPrice());
    }

    static public void setDefaultPrice(int price){
        DEFAULT_PRICE = price;
    }

    public static Builder builder(){
        return new Builder();
    }

    static class Builder {
        private String name = "";
        private int price = 0;

        public void setName(String name) {
            this.name = name;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public Pricing build(){
            return new Pricing(this.name, this.price);
        }
    }
}
