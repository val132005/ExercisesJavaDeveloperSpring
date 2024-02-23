package com.val132005.spring.map;

import java.util.Map;

public class Costumer {
    private String name;
    private Map<Integer, String> products;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Integer, String> getProducts() {
        return products;
    }

    public void setProducts(Map<Integer, String> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "costumer{" +
                "name='" + name + '\'' +
                ", products=" + products +
                '}';
    }
}
