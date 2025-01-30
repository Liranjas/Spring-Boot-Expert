package io.github.cursodsousa.produtosapi.repository;

import io.github.cursodsousa.produtosapi.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, String> {

    List<Product> findByName(String name);
}
