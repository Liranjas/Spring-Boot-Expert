package io.github.cursodsousa.produtosapi.repository;

import io.github.cursodsousa.produtosapi.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}
