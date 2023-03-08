package org.example.Seminar1Hw;

public abstract class HotBeverages {
    protected static String name;
    protected static Integer volume;
    protected static Integer price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        HotBeverages.name = name;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        HotBeverages.volume = volume;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        HotBeverages.price = price;
    }
}
