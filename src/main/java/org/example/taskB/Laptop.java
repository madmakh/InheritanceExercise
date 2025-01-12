package org.example.taskB;

public class Laptop extends Computers{
    private String BatteryLife;

    public Laptop(){

    }


    public Laptop(String brand, String model, String price, String color, String batteryLife) {
        super(brand, model, price, color);
        BatteryLife = batteryLife;
    }

    public String getBatteryLife() {
        return BatteryLife;
    }

    public void setBatteryLife(String batteryLife) {
        BatteryLife = batteryLife;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "BatteryLife='" + BatteryLife + '\'' +
                ", color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
