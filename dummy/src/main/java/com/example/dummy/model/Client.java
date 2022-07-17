package com.example.dummy.model;

import javax.persistence.*;

@Entity
@Table(name="clients")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String last_name;
    @Column(name="role")
    private String role;

    public Client(long id, String firstName, String last_name, String role) {
        this.id = id;
        this.firstName = firstName;
        this.last_name = last_name;
        this.role = role;
    }
    public Client(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String first_name) {
        this.firstName = firstName;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", first_name='" + firstName + '\'' +
                ", last_name='" + last_name + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
