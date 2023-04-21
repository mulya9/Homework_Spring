package lessons_33.task_24.spring_core.entity;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.math.BigDecimal;
@ToString
@Getter
@AllArgsConstructor
@EqualsAndHashCode(of = {"id"})
public class Product {


    private Long id;

    private String name;

    private BigDecimal prise;

}
