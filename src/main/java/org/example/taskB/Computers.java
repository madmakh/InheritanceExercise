package org.example.taskB;

public class Computers extends Electronics {
    protected String color;

    public Computers() {
    }

    public Computers(String brand, String model, String price, String color) {
        super(brand, model, price);
        this.color = color;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Computers{" +
                "color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
