package com.edu.usbcali.murciaecomerce.model.repository;

import com.edu.usbcali.murciaecomerce.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
