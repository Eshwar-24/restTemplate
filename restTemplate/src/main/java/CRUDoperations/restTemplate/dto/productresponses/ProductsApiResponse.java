package CRUDoperations.restTemplate.dto.productresponses;

import CRUDoperations.restTemplate.dto.ApiResponse;
import CRUDoperations.restTemplate.model.Product;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;

import java.util.List;
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonPropertyOrder({"statuscode","statusMessage","success","data"})
public class ProductsApiResponse extends ApiResponse {
    List<Product> data;
}
