package reflections_and_annotation.section_06_spring;

import reflections_and_annotation.annotations_for_section5_and_section6.Autowired;
import reflections_and_annotation.annotations_for_section5_and_section6.Component;

import java.util.List;

@Component
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> getFinalPrice(List<Product> items) {
        List<Product> list = repository.getPrice(items);

        for (Product product : list) {
            product.setPrice(product.getPrice() * (100 - product.getDiscount()) / 100);

            System.out.println("Price of " + product.getName() + " after " + product.getDiscount() + "% discount is " +
                    product.getPrice());
        }
        return list;
    }

}