package dev.oudom.webmvc.init;

import dev.oudom.webmvc.domain.Category;
import dev.oudom.webmvc.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class CategoryDataInitializer implements CommandLineRunner {

    private final CategoryRepository categoryRepository;

    @Override
    public void run(String... args) {
        if (categoryRepository.count() > 0) {
            return;
        }

        List<String> defaultCategoryNames = List.of(
                "Electronics",
                "Clothing",
                "Books",
                "Home & Kitchen",
                "Sports"
        );

        List<Category> categories = defaultCategoryNames.stream()
                .map(this::newCategory)
                .toList();

        categoryRepository.saveAll(categories);
    }

    private Category newCategory(String name) {
        Category category = new Category();
        category.setName(name);
        return category;
    }
}
