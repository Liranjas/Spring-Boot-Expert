package io.github.cursodsousa.produtosapi.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import io.github.cursodsousa.produtosapi.entity.Product;
import io.github.cursodsousa.produtosapi.repository.ProductRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("products")
public class ProductController {

    private ProductRepository productRepository;

    public ProductController(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    @PostMapping
    public Product save(@RequestBody Product product){
        System.out.println("Product received:" + product);

        var id= UUID.randomUUID().toString();
        product.setId(id);

        productRepository.save(product);
        return product;
    }

//    @GetMapping
//    public List<Product> searchAll() {
//        return productRepository.findAll();
//    }

    @GetMapping
    public List<Product> paramSearch(@RequestParam String name) {
        return productRepository.findByName(name);
    }

    @GetMapping("/{id}")
    public Product searchForId(@PathVariable String id){
        return productRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") String id,
                          @RequestBody Product product){
        product.setId(id);
        productRepository.save(product);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id){
        productRepository.deleteById(id);
    }
}



