package com.udemy.api;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Timestamp;

public class UserAdres  {
    @JsonProperty
    private int id;
    @JsonProperty
    private int user_id;
    @JsonProperty
    private String country;
    @JsonProperty
    private String postal_code;
    @JsonProperty
    private String street_name;
    @JsonProperty
    private String street_number;
    @JsonProperty
    private Timestamp created_at;
    @JsonProperty
    private Timestamp updated_at;

    /**
     * GET constructor
     * @param id
     * @param user_id
     * @param country
     * @param postal_code
     * @param street_name
     * @param street_number
     * @param created_at
     * @param updated_at
     */
    public UserAdres(int id, int user_id, String country, String postal_code, String street_name, String street_number, Timestamp created_at, Timestamp updated_at) {
        this.id = id;
        this.user_id = user_id;
        this.country = country;
        this.postal_code = postal_code;
        this.street_name = street_name;
        this.street_number = street_number;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    /**
     * SET constructor
     * @param user_id
     * @param country
     * @param postal_code
     * @param street_name
     * @param street_number
     */
    public UserAdres(int user_id, String country, String postal_code, String street_name, String street_number) {
        this.user_id = user_id;
        this.country = country;
        this.postal_code = postal_code;
        this.street_name = street_name;
        this.street_number = street_number;
    }

    public int getId() {
        return id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }

    public String getStreet_name() {
        return street_name;
    }

    public void setStreet_name(String street_name) {
        this.street_name = street_name;
    }

    public String getStreet_number() {
        return street_number;
    }

    public void setStreet_number(String street_number) {
        this.street_number = street_number;
    }

    public Timestamp getUpdated_at() {
        return updated_at;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }
}
