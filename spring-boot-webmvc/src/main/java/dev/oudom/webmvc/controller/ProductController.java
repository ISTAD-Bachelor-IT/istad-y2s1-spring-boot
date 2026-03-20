package dev.oudom.webmvc.controller;

import dev.oudom.webmvc.dto.CreateProductRequest;
import dev.oudom.webmvc.dto.ProductResponse;
import dev.oudom.webmvc.dto.UpdateProductRequest;
import dev.oudom.webmvc.service.ProductService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
@RequiredArgsConstructor
@Slf4j
public class ProductController {

    private final ProductService productService;

    @GetMapping
    public Page<ProductResponse> getProducts(
            @RequestParam(required = false, defaultValue = "0") int pageNumber,
            @RequestParam(required = false, defaultValue = "10") int pageSize) {
        log.info("getProducts");
        return productService.getProducts(pageNumber, pageSize);
    }

    @GetMapping("/{code}")
    public ProductResponse getByCode(@PathVariable String code) {
        log.info("getByCode");
        return null;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProductResponse createNew(@Valid @RequestBody CreateProductRequest createProductRequest) {
        log.info("createProductRequest: {}", createProductRequest);
        return productService.createProduct(createProductRequest);
    }

    @PutMapping("/{code}")
    public ProductResponse updateByCode(
            @RequestBody UpdateProductRequest updateProductRequest,
            @PathVariable String code) {
        log.info("updateByCode: {} and code: {}", updateProductRequest, code);
        return null;
    }

    @PatchMapping("/{code}")
    public ProductResponse patchByCode(
            @PathVariable String code,
            @RequestBody UpdateProductRequest updateProductRequest
    ) {
        log.info("patchByCode: {} and code: {}",
                updateProductRequest,
                code);
        return null;
    }

    @DeleteMapping("/{code}")
    public void deleteByCode(@PathVariable String code) {
        log.info("deleteByCode: {}", code);
    }

}
