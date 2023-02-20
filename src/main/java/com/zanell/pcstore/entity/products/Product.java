package com.zanell.pcstore.entity.products;

import java.util.Objects;

public abstract class Product {

    private String code;
    private String branch;
    private String model;

    public Product(String code, String branch, String model) {
        this.code = code;
        this.branch = branch;
        this.model = model;
    }

    public Product(){}

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Product{" +
                "code='" + code + '\'' +
                ", branch='" + branch + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Product)) {
            return false;
        }
        Product other = (Product) obj;
        return Objects.equals(getCode(), other.getCode());
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }
}
