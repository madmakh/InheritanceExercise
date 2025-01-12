package org.example.taskB;

public class Desktop extends Computers{
    private String storage;

    public Desktop() {
    }

    public Desktop(String brand, String model, String price, String color, String storage) {
        super(brand, model, price, color);
        this.storage = storage;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "Desktop{" +
                "storage=" + storage +
                ", color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
