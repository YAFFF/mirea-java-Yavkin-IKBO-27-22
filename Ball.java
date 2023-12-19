package practicalWork1;

import java.util.concurrent.ThreadLocalRandom;

public class Ball {
    private Double weight;
    private String color;

    public Ball(Double weight, String color){
        this.weight = weight;
        this.color = color;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public Double weightOnJupiter(){
        return weight * 2.5;
    }
    public String colorWithColorBlindness(){
        return switch (ThreadLocalRandom.current().nextInt(0, 3)) {
            case (0) -> "green mb, idk, i have a color blindness";
            case (1) -> "red mb, idk, i have a color blindness";
            case (2) -> "yellow mb, idk, i have a color blindness";
            default -> "o";
        };
    }

    public String toString(){
        return "BALL. Weight: " + weight + "; Color: " + color + ".";
    }
}
