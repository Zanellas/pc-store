package com.zanell.pcstore.entity.order;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;

public class CartFactory {

    Map<String, Cart> carts = new HashMap<>();

    public CartFactory() {}

    public Cart create(String clientKey) {
        if (carts.containsKey(clientKey)) {
            return carts.get(clientKey);
        }
        Cart newCart = new Cart();
        carts.put(clientKey, newCart);
        return newCart;
    }

    public BigDecimal getAverageTicketValue() {
        if (carts.isEmpty()) {
            return BigDecimal.ZERO;
        }
        BigDecimal sumValueTotal = BigDecimal.ZERO;
        for (Cart carrinho : carts.values()) {
            sumValueTotal = sumValueTotal.add(carrinho.getAmount());
        }
        BigDecimal quantityCarts = new BigDecimal(carts.size());
        BigDecimal averageTicketValue = sumValueTotal.divide(quantityCarts, 2, RoundingMode.HALF_UP);
        return averageTicketValue;
    }

    public boolean invalidate(String clientKey) {
        Cart cart = carts.remove(clientKey);
        return (cart != null);
    }

}
