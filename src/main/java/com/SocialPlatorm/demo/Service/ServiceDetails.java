package com.SocialPlatorm.demo.Service;

import com.SocialPlatorm.demo.Repository.CartRepository;
import com.SocialPlatorm.demo.Repository.OrderRepository;
import com.SocialPlatorm.demo.Repository.ProductRepository;
import com.SocialPlatorm.demo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceDetails {
    @Autowired
    CartRepository cartRepository;
    @Autowired
    OrderRepository orderRepository;
    @Autowired
    ProductRepository productRepository;
    @Autowired
    UserRepository userRepository;


}
