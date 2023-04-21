package lessons_33.task_24.spring_core;

import lessons_33.task_24.spring_core.cart.Cart;
import lessons_33.task_24.spring_core.config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class Runner {

    public void start() {

        System.out.println("Time to shop");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Cart cart = context.getBean("cartBean", Cart.class);



        while (true) {
            commandsMenu();
            String commands = new Scanner(System.in).nextLine();
            switch (commands) {
                case "add" -> {
                    long id = getId();
                    cart.addProduct(id);
                }
                case "delete" -> {
                    long id = getId();
                    cart.removeProduct(id);
                }
                case "print" -> cart.print();
                case "finish" -> System.out.println("program is closed.");
            }
            if (commands.equals("finish")) return;
        }
    }

    private static int getId() {
        System.out.println("Enter id product");
        return new Scanner(System.in).nextInt();
    }

    private void commandsMenu() {
        System.out.println("""
                To add product in cart enter - add
                To delete product from cart enter - delete
                To print all products info enter - print
                To finish program enter - finish""");
    }

}
