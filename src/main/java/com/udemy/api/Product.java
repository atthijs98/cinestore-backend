package com.udemy.api;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Timestamp;

public class Product {
    @JsonProperty
    private int id;
    @JsonProperty
    private String international_title;
    @JsonProperty
    private String original_title;
    @JsonProperty
    private String romanized_title;
    @JsonProperty
    private String runtime;
    @JsonProperty
    private String poster;
    @JsonProperty
    private String plot;
    @JsonProperty
    private String year;
    @JsonProperty
    private double price;
    @JsonProperty
    private int in_stock;
    @JsonProperty
    private Timestamp created_at;
    @JsonProperty
    private Timestamp updated_at;

    /**
     * GET constructor
     * @param id
     * @param international_title
     * @param original_title
     * @param romanized_title
     * @param runtime
     * @param poster
     * @param plot
     * @param year
     * @param price
     * @param in_stock
     * @param created_at
     * @param updated_at
     */
    public Product(int id, String international_title, String original_title, String romanized_title, String runtime, String poster, String plot, String year, double price, int in_stock, Timestamp created_at, Timestamp updated_at) {
        this.id = id;
        this.international_title = international_title;
        this.original_title = original_title;
        this.romanized_title = romanized_title;
        this.runtime = runtime;
        this.poster = poster;
        this.plot = plot;
        this.year = year;
        this.price = price;
        this.in_stock = in_stock;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public Product(String international_title,String original_title, String romanized_title, String runtime, String poster, String plot, String year, double price) {
        this.international_title = international_title;
        this.original_title = original_title;
        this.romanized_title = romanized_title;
        this.runtime = runtime;
        this.poster = poster;
        this.plot = plot;
        this.year = year;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getInternational_title() {
        return international_title;
    }

    public void setInternational_title(String international_title) {
        this.international_title = international_title;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }

    public String getRomanized_title() {
        return romanized_title;
    }

    public void setRomanized_title(String romanized_title) {
        this.romanized_title = romanized_title;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getIn_stock() {
        return in_stock;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public Timestamp getUpdated_at() {
        return updated_at;
    }
}
