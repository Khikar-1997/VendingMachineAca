package com.company;

import java.util.Objects;

public class Comand {
    //region Propertys

    private String row;
    private int collons;

    //endregion

    //region Constructors

    public Comand(String row, int collons) {
        this.row = row;
        this.collons = collons;
    }

    public Comand() {
    }

    //endregion

    //region Getter and Setter

    public String getRow() {
        return row;
    }

    public void setRow(String row) {
        this.row = row;
    }

    public int getCollons() {
        return collons;
    }

    public void setCollons(int collons) {
        this.collons = collons;
    }

    //endregion

    //region equals,hashCode and toString Public Methods

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comand comand = (Comand) o;
        return collons == comand.collons &&
                Objects.equals(row, comand.row);
    }

    @Override
    public int hashCode() {
        return Objects.hash(row, collons);
    }

    @Override
    public String toString() {
        return "Comand{" +
                "row='" + row + '\'' +
                ", collons=" + collons +
                '}';
    }

    //endregion
}
