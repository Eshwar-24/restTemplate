package CRUDoperations.restTemplate.dto.productresponses;

import CRUDoperations.restTemplate.dto.ApiResponse;
import CRUDoperations.restTemplate.model.Product;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonPropertyOrder({"statuscode","statusMessage","success","data"})
public class ProductApiResponse extends ApiResponse {
public Product data;
}
