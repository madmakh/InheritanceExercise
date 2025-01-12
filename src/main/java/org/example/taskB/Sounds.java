package org.example.taskB;

public class Sounds extends Electronics {
    private String duration;
    public Sounds(){

    }


    public Sounds(String brand, String model, String price, String duration) {
        super(brand, model, price);
        this.duration = duration;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Sounds{" +
                "duration=" + duration +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
