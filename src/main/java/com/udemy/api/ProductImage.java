package com.udemy.api;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Timestamp;

public class ProductImage {
    @JsonProperty
    private int id;
    @JsonProperty
    private int product_id;
    @JsonProperty
    private String name;
    @JsonProperty
    private String path;
    @JsonProperty
    private Timestamp created_at;
    @JsonProperty
    private Timestamp updated_at;

    /**
     * GET constructor
     * @param id
     * @param product_id
     * @param name
     * @param path
     * @param created_at
     * @param updated_at
     */
    public ProductImage(int id, int product_id, String name, String path, Timestamp created_at, Timestamp updated_at) {
        this.id = id;
        this.product_id = product_id;
        this.name = name;
        this.path = path;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    /**
     * set constructor
     * @param product_id
     * @param name
     * @param path
     */
    public ProductImage(int product_id, String name, String path) {
        this.product_id = product_id;
        this.name = name;
        this.path = path;
    }

    public int getId() {
        return id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Timestamp getUpdated_at() {
        return updated_at;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }
}
