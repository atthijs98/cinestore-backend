package com.udemy.api;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Timestamp;

public class Genre {
    @JsonProperty
    private int id;
    @JsonProperty
    private String name;
    @JsonProperty
    private Timestamp created_at;
    @JsonProperty
    private Timestamp updated_at;

    /**
     * GET constructor
     * @param id
     * @param name
     * @param created_at
     * @param updated_at
     */
    public Genre(int id, String name, Timestamp created_at, Timestamp updated_at) {
        this.id = id;
        this.name = name;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    /**
     * SET constructor
     * @param name
     */
    public Genre(String name) {
        this.name = name;
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

    public Timestamp getCreated_at() {
        return created_at;
    }

    public Timestamp getUpdated_at() {
        return updated_at;
    }
}
