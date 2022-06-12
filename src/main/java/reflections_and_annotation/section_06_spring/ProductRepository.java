package reflections_and_annotation.section_06_spring;

import reflections_and_annotation.annotations_for_section5_and_section6.Component;

import java.util.List;

@Component
public class ProductRepository {

    public List<Product> getPrice(List<Product> items) {
        for (Product product : items) {

            // let's assume reading data from database
            Double price = (double) Math.round(30 * Math.random());

            System.out.println("Original price of " + product.getName() + " is " + price + " $.");

            product.setPrice(price);
        }
        return items;
    }

}