package dev.oudom.webmvc.controller;

import dev.oudom.webmvc.dto.CreateProductRequest;
import dev.oudom.webmvc.dto.ProductResponse;
import dev.oudom.webmvc.dto.UpdateProductRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
@Slf4j
public class ProductController {

    @GetMapping
    public List<ProductResponse> getProducts() {
        log.info("getProducts");
        return List.of();
    }

    @GetMapping("/{code}")
    public ProductResponse getByCode(@PathVariable Integer code) {
        log.info("getByCode");
        return null;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProductResponse createNew(@RequestBody CreateProductRequest createProductRequest) {
        log.info("createProductRequest: {}", createProductRequest);
        return null;
    }

    @PutMapping("/{code}")
    public ProductResponse updateByCode(
            @RequestBody UpdateProductRequest updateProductRequest,
            @PathVariable Integer code) {
        log.info("updateByCode: {} and code: {}", updateProductRequest, code);
        return null;
    }

    @PatchMapping("/{code}")
    public ProductResponse patchByCode(
            @PathVariable Integer code,
            @RequestBody UpdateProductRequest updateProductRequest
    ) {
        log.info("patchByCode: {} and code: {}",
                updateProductRequest,
                code);
        return null;
    }

    @DeleteMapping("/{code}")
    public void deleteByCode(@PathVariable Integer code) {
        log.info("deleteByCode: {}", code);
    }

}
