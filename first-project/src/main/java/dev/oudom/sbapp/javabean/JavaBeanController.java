package dev.oudom.sbapp.javabean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JavaBeanController {

    private final JavaBean javaBean1;
    private final JavaBean javaBean2;

    public JavaBeanController(@Qualifier("javaBean1") JavaBean javaBean2, JavaBean javaBean1) {
        this.javaBean1 = javaBean2;
        this.javaBean2 = javaBean1;
    }

    @GetMapping("/getJavaBeans")
    public List<String> getJavaBeans() {
        return List.of(javaBean1.getId(), javaBean2.getId());
    }

}
