package org.example.Seminar1Hw;

public class HotBeveragesWithTemperature extends HotBeverages{
    String name;
    Integer volume;
     Integer price;
     Integer temperature;

    @Override
    public String toString() {
        return "HotBeveragesWithTemperature{" +
                "name='" + name + '\'' +
                '}';
    }


    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Integer getVolume() {
        return volume;
    }

    @Override
    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    @Override
    public Integer getPrice() {
        return price;
    }

    @Override
    public void setPrice(Integer price) {
        this.price = price;
    }

    public HotBeveragesWithTemperature(String name, Integer volume, Integer price, Integer temperature) {
        this.name = name;
        this.volume = volume;
        this.price = price;
        this.temperature = temperature;
    }

}
