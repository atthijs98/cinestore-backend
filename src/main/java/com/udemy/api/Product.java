package com.udemy.api;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Timestamp;

public class Product {
    @JsonProperty
    private int id;
    @JsonProperty
    private String name;
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
     * @param name
     * @param runtime
     * @param poster
     * @param plot
     * @param year
     * @param price
     * @param in_stock
     * @param created_at
     * @param updated_at
     */
    public Product(int id, String name, String runtime, String poster, String plot, String year, double price, int in_stock, Timestamp created_at, Timestamp updated_at) {
        this.id = id;
        this.name = name;
        this.runtime = runtime;
        this.poster = poster;
        this.plot = plot;
        this.year = year;
        this.price = price;
        this.in_stock = in_stock;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public Product(String name, String runtime, String poster, String plot, String year, double price) {
        this.name = name;
        this.runtime = runtime;
        this.poster = poster;
        this.plot = plot;
        this.year = year;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
