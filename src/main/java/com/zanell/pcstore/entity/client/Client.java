package com.zanell.pcstore.entity.client;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Client {

    private String key;
    private String name;
    private String cpf;
    private Date birth;
    private ArrayList<Address> addresses;
    private Address mainAddress;

    public Client() {
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public List<Address> getAddress() {
        return addresses;
    }

    public Address getMainAddress() {
        for (Address a : addresses) {
            if (a.getMain()) {
                return a;
            }
        }
        return null;
    }

    public void addAddress(Address address) {
        if (this.addresses == null) {
            this.addresses = new ArrayList<>();
        }

        if (address.getMain()) {
            if (this.mainAddress != null) {
                this.mainAddress.setMain(false);
            }
            this.mainAddress = address;
        }

        this.addresses.add(address);
    }

}
