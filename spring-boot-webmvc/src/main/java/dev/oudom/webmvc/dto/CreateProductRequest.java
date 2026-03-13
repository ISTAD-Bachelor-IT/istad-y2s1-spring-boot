package dev.oudom.webmvc.dto;

import java.math.BigDecimal;

public record CreateProductRequest(
        String name,
        BigDecimal price,
        Integer qty,
        String description,
        Boolean isAvailable,
        String category
) {
}
