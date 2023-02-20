package com.zanell.pcstore.entity.order;

import com.zanell.pcstore.entity.products.Product;

import java.math.BigDecimal;

public class Item {

    private Product product;
    private BigDecimal price;
    private Integer quantity;

    public Item(Product product, BigDecimal price, Integer quantity) {
        this.product = product;
        this.price = price;
        this.quantity = quantity;
    }

    public BigDecimal getAmount() {
        return this.price.multiply(BigDecimal.valueOf(this.quantity));
    }


    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
