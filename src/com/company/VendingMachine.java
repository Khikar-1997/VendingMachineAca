package com.company;

import com.company.chips.Doritos;
import com.company.chips.Lays;
import com.company.chips.Pringles;
import com.company.chocolate.Kitkat;
import com.company.chocolate.Snickers;
import com.company.chocolate.Twix;
import com.company.juice.CocaCola;
import com.company.juice.Fanta;
import com.company.juice.Pepsi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class VendingMachine {
    //region Propertys

    private HashMap<String, ArrayList<Product>> vendingMachineProducts;

    //endregion

    //region Constructors

    public VendingMachine() {
        this.vendingMachineProducts = new HashMap<>();
        init();
    }

    //endregion

    //region Public Methods

    private void init() {
        ArrayList<Product> chips = new ArrayList<>();
        Lays lays = new Lays("Lays");
        Doritos doritos = new Doritos("Doritos");
        Pringles pringles = new Pringles("Pringles");
        chips.add(lays);
        chips.add(doritos);
        chips.add(pringles);

        ArrayList<Product> juice = new ArrayList<>();
        Pepsi pepsi = new Pepsi("Pepsi");
        CocaCola cocaCola = new CocaCola("Coca cola");
        Fanta fanta = new Fanta("Fanta");
        juice.add(pepsi);
        juice.add(cocaCola);
        juice.add(fanta);

        ArrayList<Product> chocolate = new ArrayList<>();
        Snickers snickers = new Snickers("Snickers");
        Kitkat kitkat = new Kitkat("Kitkat");
        Twix twix = new Twix("Twix");
        chocolate.add(snickers);
        chocolate.add(kitkat);
        chocolate.add(twix);

        vendingMachineProducts.put("A", chips);
        vendingMachineProducts.put("B",juice);
        vendingMachineProducts.put("C",chocolate);
    }

    public Product getProduct(Comand comand){
        if (vendingMachineProducts.containsKey(comand.getRow())){
            return vendingMachineProducts.get(comand.getRow()).get(comand.getCollons() - 1);
        } else {
            throw new RuntimeException("Reload program");
        }
    }

    //endregion

    //region Getter and Setter

    public HashMap<String, ArrayList<Product>> getVendingMachineProducts() {
        return vendingMachineProducts;
    }

    public void setVendingMachineProducts(HashMap<String, ArrayList<Product>> vendingMachineProducts) {
        this.vendingMachineProducts = vendingMachineProducts;
    }

    //endregion

    //region equals,hashCode and toString Public Methods

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VendingMachine that = (VendingMachine) o;
        return Objects.equals(vendingMachineProducts, that.vendingMachineProducts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vendingMachineProducts);
    }

    @Override
    public String toString() {
        return "VendingMachine{" +
                "vendingMachineProducts=" + vendingMachineProducts +
                '}';
    }

    //endregion
}
