package CRUDoperations.restTemplate.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter@Getter@NoArgsConstructor@ToString
public class Product {
    Integer id;
    String name;
    Float price;
    Float tax;
    Status status;
}
