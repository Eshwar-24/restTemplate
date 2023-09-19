package CRUDoperations.restTemplate.controller;

import CRUDoperations.restTemplate.constrains.Constraints;
import CRUDoperations.restTemplate.dto.productresponses.ProductApiResponse;
import CRUDoperations.restTemplate.dto.productresponses.ProductsApiResponse;
import CRUDoperations.restTemplate.model.Product;
import CRUDoperations.restTemplate.service.RestTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(Constraints.REST_TEMPLATE)
public class RestTemplateController {
    @Autowired
    RestTemplateService restTemplateService;
    @GetMapping
    public ResponseEntity<ProductsApiResponse> getproducts(){
return restTemplateService.getProducts();
    }
    @PostMapping
    public ResponseEntity<ProductApiResponse> createProduct(@RequestBody Product product){
        return restTemplateService.createProduct(product);
    }
}
