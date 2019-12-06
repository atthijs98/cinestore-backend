package com.udemy.api;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Timestamp;
import java.util.Date;

public class User {
    @JsonProperty
    private int user_id;

    @JsonProperty
    private String uuid;

    @JsonProperty
    private String email;

    @JsonProperty
    private String first_name;

    @JsonProperty
    private String middle_name;

    @JsonProperty
    private String last_name;

    @JsonProperty
    private Date date_of_birth;

    @JsonProperty
    private String password;

    @JsonProperty
    private String user_role;

    @JsonProperty
    private Timestamp created_at;

    @JsonProperty
    private Timestamp updated_at;

    /**
     * Get constructor
     * @param user_id
     * @param uuid
     * @param email
     * @param first_name
     * @param middle_name
     * @param last_name
     * @param date_of_birth
     * @param password
     * @param user_role
     * @param created_at
     * @param updated_at
     */
    public User(int user_id, String uuid, String email, String first_name, String middle_name, String last_name, Date date_of_birth, String password, String user_role, Timestamp created_at, Timestamp updated_at) {
        this.user_id = user_id;
        this.uuid = uuid;
        this.email = email;
        this.first_name = first_name;
        this.middle_name = middle_name;
        this.last_name = last_name;
        this.date_of_birth = date_of_birth;
        this.password = password;
        this.user_role = user_role;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    /**
     * Post constructor
     * @param uuid
     * @param email
     * @param first_name
     * @param middle_name
     * @param last_name
     * @param date_of_birth
     * @param password
     * @param user_role
     */
    public User(String uuid, String email, String first_name, String middle_name, String last_name, Date date_of_birth, String password, String user_role) {
        this.uuid = uuid;
        this.email = email;
        this.first_name = first_name;
        this.middle_name = middle_name;
        this.last_name = last_name;
        this.date_of_birth = date_of_birth;
        this.password = password;
        this.user_role = user_role;
    }

    public int getUserId() {return user_id;}
    public String getUuid() {return uuid;}
    public void setUuid(String uuid) {this.uuid = uuid;}

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getMiddle_name() {
        return middle_name;
    }

    public void setMiddle_name(String middle_name) {
        this.middle_name = middle_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Date getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(Date date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser_role() {
        return user_role;
    }

    public void setUser_role(String user_role) {
        this.user_role = user_role;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public Timestamp getUpdated_at() {
        return updated_at;
    }
}
