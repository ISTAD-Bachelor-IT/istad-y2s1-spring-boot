package dev.oudom.webmvc.service;

import dev.oudom.webmvc.dto.CreateProductRequest;
import dev.oudom.webmvc.dto.ProductResponse;
import org.springframework.data.domain.Page;

public interface ProductService {
    ProductResponse createProduct(CreateProductRequest createProductRequest);
    Page<ProductResponse> getProducts(int pageNumber, int pageSize);
}
