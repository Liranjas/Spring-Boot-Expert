package io.github.cursodsousa.produtosapi.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import io.github.cursodsousa.produtosapi.entity.Product;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("products")
public class ProductController {

    @PostMapping
    public void save(Product product){
        System.out.println("Product received:" + product);
    }
}
