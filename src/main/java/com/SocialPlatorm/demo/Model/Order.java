package com.SocialPlatorm.demo.Model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "orders")
public class Order {
    @Id
    private String id;
    private String userId;
    private List<Model.CartItem> orderItems;
    private Double totalAmount;
    private String paymentStatus;
    private String paymentIntentId;
}