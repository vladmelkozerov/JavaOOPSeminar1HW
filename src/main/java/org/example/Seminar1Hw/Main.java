package org.example.Seminar1Hw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        VendingMachineBeverages vmb = new VendingMachineBeverages();
        List<HotBeveragesWithTemperature> beverages= new ArrayList<>(Arrays.asList(
                new HotBeveragesWithTemperature("Чай",200,50,80),
                new HotBeveragesWithTemperature("Кофе",200,70,85),
                new HotBeveragesWithTemperature("Какао",300,60,50),
                new HotBeveragesWithTemperature("Сбитень",300,120,60)));
        vmb.initProducts(beverages);
        System.out.println(vmb.getProducts("Сбитень",300,60));

    }
}
