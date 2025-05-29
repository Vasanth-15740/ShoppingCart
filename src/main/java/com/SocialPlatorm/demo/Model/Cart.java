package Model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "carts")
public class Cart {
    @Id
    private String id;
    private String userId;
    private List<CartItem> items;
}
