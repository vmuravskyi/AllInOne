package epam.qaSummer.lesson15;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.util.Arrays.sort;

@FunctionalInterface
interface MyOp<T> {
    T operation(T x, T y);
}
class Country {
    String name;
    int square;
    int population;

    public Country(String name, int square, int population) {
        this.name = name;
        this.square = square;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", square='" + square + '\'' +
                ", population=" + population +
                '}';
    }
}

public class Program {
    public static void main(String[] args) {
        MyOp<Double> sum = (Double x, Double y) -> x + y;
        double result = sum.operation(2.0, 3.0);
        System.out.println(result);


        Country[] countries = {
                new Country("A", 140, 1200),
                new Country("B", 100, 1100),
                new Country("C", 120, 1300)
        };

        Arrays.sort(countries, (o1, o2) -> o1.getPopulation() - o2.getPopulation());
        System.out.println(Arrays.toString(countries));
        Arrays.sort(countries, (o1, o2) -> o1.getSquare() - o2.getSquare());
        System.out.println(Arrays.toString(countries));
        Arrays.sort(countries, Comparator.comparing(Country::getName));
        System.out.println(Arrays.toString(countries));

        List.of(countries).forEach(country -> System.out.println(country.toString()));

    }
}
