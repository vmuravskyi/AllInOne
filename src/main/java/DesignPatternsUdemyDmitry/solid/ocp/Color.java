package DesignPatternsUdemyDmitry.solid.ocp;

import java.util.List;
import java.util.stream.Stream;

enum Color {
    RED, GREEN, BLUE
}

enum Size {
    SMALL, MEDIUM, LARGE, YUGE
}

class Product {

    public String name;
    public Color color;
    public Size size;

    public Product(String name, Color color, Size size) {
        this.name = name;
        this.color = color;
        this.size = size;
    }
}

class ProductFilter {

    public Stream<Product> filterByColor(List<Product> products, Color color) {
        return products.stream().filter(product -> product.color.equals(color));
    }

    public Stream<Product> filterBySize(List<Product> products, Size size) {
        return products.stream().filter(product -> product.size.equals(size));
    }

    public Stream<Product> filterByColorAndSize(List<Product> products, Color color, Size size) {
        return products.stream().filter(product -> product.size == size && product.color == color);
    }

    public Stream<Product> filterByCriterion(List<Product> products) {
        return null;
    }
}

interface Specification<T> {
    boolean isSatisfied(T item);
}

interface Filter<T> {
    Stream<T> filter(List<Product> items, Specification<T> spec);
}

class BetterFilter implements Filter<Product> {

    @Override
    public Stream<Product> filter(List<Product> items,
        Specification<Product> spec) {
        return items
            .stream()
            .filter(spec::isSatisfied);
    }
}

class ColorSpecification implements Specification<Product> {
    Color color;

    public ColorSpecification(Color color) {
        this.color = color;
    }

    @Override
    public boolean isSatisfied(Product item) {
        return item.color == color;
    }
}

class SizeSpecification implements Specification<Product> {
    Size size;

    public SizeSpecification(Size size) {
        this.size = size;
    }

    @Override
    public boolean isSatisfied(Product item) {
        return item.size == size;
    }
}

class AndSpecification<T> implements Specification<T> {

    private Specification<T> first, second;

    public AndSpecification(Specification<T> first, Specification<T> second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean isSatisfied(T item) {
        return first.isSatisfied(item) && second.isSatisfied(item);
    }
}

class Demo {

    public static void main(String[] args) {
        Product apple = new Product("apple", Color.GREEN, Size.SMALL);
        Product tree = new Product("tree", Color.GREEN, Size.LARGE);
        Product house = new Product("house", Color.BLUE, Size.LARGE);
        Product laptop = new Product("laptop", Color.RED, Size.MEDIUM);

        ProductFilter pf = new ProductFilter();
        List<Product> products = List.of(apple, tree, house, laptop);
        System.out.println("Green products (old):");
        pf.filterByColor(products, Color.GREEN)
                .forEach(product -> System.out.println(" - " + product.name + " is green"));

        BetterFilter bf = new BetterFilter();
        System.out.println("Red products (new): ");
        bf.filter(products, new ColorSpecification(Color.RED))
                .forEach(product -> System.out.println(" - " + product.name));


        System.out.println("Green and small items are: ");
        bf.filter(products,
                new AndSpecification<>(
                        new ColorSpecification(Color.GREEN),
                        new SizeSpecification(Size.SMALL)
                ))
                .forEach(p -> System.out.println(" - " + p.name));
    }
}
