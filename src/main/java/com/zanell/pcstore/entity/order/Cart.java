package com.zanell.pcstore.entity.order;

import com.zanell.pcstore.entity.products.Product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Cart {

    private List<Item> itens;

    public Cart() {
        this.itens = new ArrayList<>();
    }

    public void addItem(Product product, BigDecimal price, int quantity) {
        if (product == null || price == null || quantity < 1) {
            throw new RuntimeException("Produto, valor unitário e quantidade devem ser informados");
        }
        Item existingItem = null;
        for (Item item : itens) {
            if (item.getProduct().equals(product)) {
                existingItem = item;
                break;
            }
        }
        if (existingItem != null) {
            if (!existingItem.getPrice().equals(price)) {
                existingItem.setPrice(price);
            }
            existingItem.setQuantity(existingItem.getQuantity() + quantity);
        } else {
            Item novoItem = new Item(product, price, quantity);
            itens.add(novoItem);
        }
    }

    public boolean removeItem(Product product) {
        Item other = null;
        for (Item item : itens) {
            if (item.getProduct().equals(product)) {
                other = item;
                break;
            }
        }
        if (other == null) {
            return false;
        }
        itens.remove(other);
        return true;
    }

    public boolean removeItem(int itemPosition) {
        if (itemPosition >= 0 && itemPosition < itens.size()) {
            itens.remove(itemPosition);
            return true;
        }
        return false;
    }

    public BigDecimal getAmount() {
        return itens.stream()
                .map(Item::getAmount)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public Collection<Item> getItens() {
        return this.itens.stream().collect(Collectors.toList());
    }

}
