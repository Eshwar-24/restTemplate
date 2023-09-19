package CRUDoperations.restTemplate.dto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ApiResponse {
    int statuscode;
    String StatusMessage;
    Boolean success;
}
