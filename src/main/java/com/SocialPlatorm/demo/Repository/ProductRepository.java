package com.SocialPlatorm.demo.Repository;

import Model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.Optional;
public interface ProductRepository extends MongoRepository<Product, String> {}
