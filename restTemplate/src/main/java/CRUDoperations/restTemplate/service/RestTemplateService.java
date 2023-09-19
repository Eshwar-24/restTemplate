package CRUDoperations.restTemplate.service;

import CRUDoperations.restTemplate.dto.productresponses.ProductApiResponse;
import CRUDoperations.restTemplate.dto.productresponses.ProductsApiResponse;
import CRUDoperations.restTemplate.model.Product;
import CRUDoperations.restTemplate.constrains.Constraints;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class RestTemplateService {
    @Autowired
    RestTemplate restTemplate;
    @Value("${base_url}")
    String base_url;
    public ResponseEntity<ProductsApiResponse> getProducts(){
        HttpHeaders httpHeaders=new HttpHeaders();
        httpHeaders.set(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE);
        HttpEntity httpEntity=new HttpEntity<>("parameters",httpHeaders);

        ResponseEntity<ProductsApiResponse> responseEntity= restTemplate.exchange(
                base_url+Constraints.PRODUCT_URL, HttpMethod.GET,httpEntity, ProductsApiResponse.class);
        return responseEntity;
    }

    public ResponseEntity<ProductApiResponse> createProduct(Product product) {
        ResponseEntity<ProductApiResponse> responseEntity=restTemplate.postForEntity(base_url+Constraints.PRODUCT_URL,product, ProductApiResponse.class);
        return responseEntity;
    }
}
