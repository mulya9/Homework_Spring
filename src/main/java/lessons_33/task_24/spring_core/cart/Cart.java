package lessons_33.task_24.spring_core.cart;

import lessons_33.task_24.spring_core.entity.Product;
import lessons_33.task_24.spring_core.repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cart {

    private List<Product> productList;
    private ProductRepository productRepository;

    public Cart(ProductRepository productRepository) {
        this.productList = new ArrayList<>();
        this.productRepository = productRepository;
    }

    public void addProduct(Long id) {
        Product product = productRepository.getProductById(id);
        productList.add(product);
        productRepository.deleteProduct(product);
    }

    public void removeProduct(Long id) {
        Product product = productList.stream().filter(p -> Objects.equals(p.getId(), id)).findFirst().orElseThrow();
        productList.remove(product);
        productRepository.addProduct(product);
    }

    public void print() {
        System.out.println("Cart " + productRepository.getProductAllList());
        System.out.println("Order " + productList);
    }
}
