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

import java.util.*;

public class VendingMachine {
    //region Propertys

    private HashMap<String, ArrayList<Queue<Product>>> vendingMachineProducts;

    //endregion

    //region Constructors

    public VendingMachine() {
        this.vendingMachineProducts = new HashMap<>();
        init();
    }

    //endregion

    //region Public Methods

    private void init() {
        ArrayList<Queue<Product>> chips = new ArrayList<>();
        Queue<Product> layses = new LinkedList<>();
        Queue<Product> doritoses = new LinkedList<>();
        Queue<Product> pringleses = new LinkedList<>();
        Lays lays = new Lays("Lays");
        Doritos doritos = new Doritos("Doritos");
        Pringles pringles = new Pringles("Pringles");
        for (int i = 0; i < 10; i++) {
            layses.add(lays);
            doritoses.add(doritos);
            pringleses.add(pringles);
        }
        chips.add(layses);
        chips.add(doritoses);
        chips.add(pringleses);


        ArrayList<Queue<Product>> juice = new ArrayList<>();
        Queue<Product> pepsiCollon = new LinkedList<>();
        Queue<Product> cocaColaCollon = new LinkedList<>();
        Queue<Product> fantaCollon = new LinkedList<>();
        Pepsi pepsi = new Pepsi("Pepsi");
        CocaCola cocaCola = new CocaCola("Coca cola");
        Fanta fanta = new Fanta("Fanta");
        for (int i = 0; i < 10; i++) {
            pepsiCollon.add(pepsi);
            cocaColaCollon.add(cocaCola);
            fantaCollon.add(fanta);
        }
        juice.add(pepsiCollon);
        juice.add(cocaColaCollon);
        juice.add(fantaCollon);

        ArrayList<Queue<Product>> chocolate = new ArrayList<>();
        Queue<Product> snickersCollon = new LinkedList<>();
        Queue<Product> kitkatCollon = new LinkedList<>();
        Queue<Product> twixCollon = new LinkedList<>();
        Snickers snickers = new Snickers("Snickers");
        Kitkat kitkat = new Kitkat("Kitkat");
        Twix twix = new Twix("Twix");
        for (int i = 0; i < 10; i++) {
            snickersCollon.add(snickers);
            kitkatCollon.add(kitkat);
            twixCollon.add(twix);
        }
        chocolate.add(snickersCollon);
        chocolate.add(kitkatCollon);
        chocolate.add(twixCollon);

        vendingMachineProducts.put("A", chips);
        vendingMachineProducts.put("B", juice);
        vendingMachineProducts.put("C", chocolate);
    }


    //endregion

    public Product getProduct(Comand comand) {
        if (vendingMachineProducts.containsKey(comand.getRow())) {
            vendingMachineProducts.get(comand.getRow()).get(comand.getCollons() - 1).remove();
            return vendingMachineProducts.get(comand.getRow()).get(comand.getCollons() - 1).element();
        } else {
            throw new RuntimeException("reload program");
        }
    }

    public int sizeOfProductCollon(Comand comand) {
        return vendingMachineProducts.get(comand.getRow()).get(comand.getCollons() - 1).size();
    }
    //region Getter and Setter

    public HashMap<String, ArrayList<Queue<Product>>> getVendingMachineProducts() {
        return vendingMachineProducts;
    }

    public void setVendingMachineProducts(HashMap<String, ArrayList<Queue<Product>>> vendingMachineProducts) {
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
