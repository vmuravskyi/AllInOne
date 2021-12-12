package epam.qaSummer.HomeWork5.main.java.com.epam.test.automation.java.practice5;

public class Rectangle {
    private double sideA;
    private double sideB;

    public Rectangle(double a, double b) {
        this.sideA = a;
        this.sideB = b;
    }

    public Rectangle(double a) {
        this.sideA = a;
        this.sideB = 5;
    }

    public Rectangle() {
        this.sideA = 4;
        this.sideB = -3;
    }


    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideA() {
        if (sideA < 0) {
            return Math.abs(sideA);
        } else return sideA;
    }

    public double getSideB() {
        if (sideB < 0) {
            return Math.abs(sideB);
        } else return sideB;
    }


    public double area() {
        return getSideA() * getSideB();
    }

    public double perimeter() {
        return (getSideA() + getSideB()) * 2;
    }

    public boolean isSquare() {
        return getSideA() == getSideB();
    }

    public void replaceSides() {
        double temp = sideA;
        sideA = sideB;
        sideB = temp;
    }
}