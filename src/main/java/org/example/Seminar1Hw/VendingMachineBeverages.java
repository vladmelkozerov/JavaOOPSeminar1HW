package org.example.Seminar1Hw;

import java.util.ArrayList;
import java.util.List;

public class VendingMachineBeverages extends VendingMachine{
    List <HotBeveragesWithTemperature> hotBeverages = new ArrayList<>();

    public void initProducts(List <HotBeveragesWithTemperature> HB) {
        this.hotBeverages = HB;
    }
    @Override
    public String getProducts(String name) {
        for (HotBeveragesWithTemperature hb: hotBeverages) {
            if (hb.getName().contains(name)) return hb.getName().toString();
        }
        return ("He найдено");

    }
    public String getProducts(String name,Integer volume, Integer temperature) {
        for (HotBeveragesWithTemperature hb: hotBeverages) {
            if (hb.getName().contains(name) &&hb.getVolume().equals(volume)&&hb.getTemperature().equals(temperature)) return "По Вашему запросу в автомате имеется напиток "+hb.getName().toString();
        }
        return ("He найдено соответствий");

    }
}
