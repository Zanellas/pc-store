package com.zanell.pcstore.entity.client;

public class Address {

    private Client client;
    private Boolean main;
    private String country;
    private String state;
    private String city;
    private String cep;
    private String street;
    private String number;

    public Address(Client client, Boolean main, String country, String state, String city, String cep, String street, String number) {
        this.client = client;
        this.main = main;
        this.country = country;
        this.state = state;
        this.city = city;
        this.cep = cep;
        this.street = street;
        this.number = number;
    }

    public Address(Boolean main, String country, String state, String city, String cep, String street, String number) {
        this.main = main;
        this.country = country;
        this.state = state;
        this.city = city;
        this.cep = cep;
        this.street = street;
        this.number = number;
    }

    public Address() {
    }



    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Boolean getMain() {
        return main;
    }

    public void setMain(Boolean main) {
        this.main = main;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
