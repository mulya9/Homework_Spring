package lessons_33.task_24.spring_core.repository;

import lessons_33.task_24.spring_core.entity.Product;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.*;

@Repository
public class ProductRepository {

   public List<Product> productList;

    public ProductRepository() {
        this.productList = loadProduct();
    }

    public List<Product> loadProduct() {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1L,"bred", BigDecimal.valueOf(22)));
        products.add(new Product(2L,"bear", BigDecimal.valueOf(34)));
        products.add(new Product(3L,"milk", BigDecimal.valueOf(47)));
        return products;
    }

    public Product getProductById(Long id) {
        return productList.stream().filter(p -> Objects.equals(p.getId(), id)).findFirst().orElseThrow();
    }

    public void deleteProduct(Product product) {
        productList.remove(product);
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public List<Product> getProductAllList() {
        return productList;
    }
}
