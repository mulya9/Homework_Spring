package lessons_33.task_24.spring_core.config;

import lessons_33.task_24.spring_core.cart.Cart;
import lessons_33.task_24.spring_core.repository.ProductRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config {

    @Bean
    public ProductRepository productRepository() {
        return new ProductRepository();
    }

    @Bean
    @Scope("prototype")
    public Cart cartBean() {
        return new Cart(productRepository());
    }
}
