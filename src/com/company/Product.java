package com.company;

import java.util.Objects;

public abstract class Product {

    //region Propertys

    private String name;

    //endregion

    //region Constructors

    public Product(String name) {
        this.name = name;
    }

    public Product() {
    }

    //endregion

    //region Public Methods

    //endregion

    //region Getter and Setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //endregion

    //region equals,hashCode and toString Public Methods

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                '}';
    }

    //endregion
}
