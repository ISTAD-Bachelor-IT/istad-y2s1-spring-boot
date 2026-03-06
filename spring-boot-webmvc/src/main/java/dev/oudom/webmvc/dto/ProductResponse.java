package dev.oudom.webmvc.dto;

import java.math.BigDecimal;

public record ProductResponse(
        Integer code,
        String name,
        BigDecimal price
) {
}
