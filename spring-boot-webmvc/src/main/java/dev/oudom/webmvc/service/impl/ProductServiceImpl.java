package dev.oudom.webmvc.service.impl;

import dev.oudom.webmvc.domain.Category;
import dev.oudom.webmvc.domain.Product;
import dev.oudom.webmvc.dto.CreateProductRequest;
import dev.oudom.webmvc.dto.ProductResponse;
import dev.oudom.webmvc.mapper.ProductMapper;
import dev.oudom.webmvc.repository.CategoryRepository;
import dev.oudom.webmvc.repository.ProductRepository;
import dev.oudom.webmvc.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;
    private final CategoryRepository categoryRepository;

    @Override
    public ProductResponse createProduct(CreateProductRequest createProductRequest) {

        Category category = categoryRepository.findCategoryByName(createProductRequest.category());

        Product product = productMapper.toProduct(createProductRequest);
        product.setCode("P-" + UUID.randomUUID());
        product.setCategory(category);
        productRepository.save(product);

        return productMapper.fromProduct(product);
    }
}
