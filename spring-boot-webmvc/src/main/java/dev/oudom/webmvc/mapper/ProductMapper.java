package dev.oudom.webmvc.mapper;

import dev.oudom.webmvc.domain.Product;
import dev.oudom.webmvc.dto.CreateProductRequest;
import dev.oudom.webmvc.dto.ProductResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    @Mapping(target = "code", ignore = true)
    @Mapping(target = "isAvailable", ignore = true)
    @Mapping(target = "category", ignore = true)
    @Mapping(target = "orderLines", ignore = true)
    Product toProduct(CreateProductRequest createProductRequest);

    @Mapping(source = "category.name", target = "categoryName")
    ProductResponse fromProduct(Product product);
}
