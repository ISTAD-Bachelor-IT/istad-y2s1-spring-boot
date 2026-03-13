package dev.oudom.webmvc.mapper;

import dev.oudom.webmvc.domain.Product;
import dev.oudom.webmvc.dto.CreateProductRequest;
import dev.oudom.webmvc.dto.ProductResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    @Mapping(source = "category", target = "category.name")
    Product toProduct(CreateProductRequest createProductRequest);

    ProductResponse fromProduct(Product product);
}
