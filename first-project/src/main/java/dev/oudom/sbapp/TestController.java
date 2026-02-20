package dev.oudom.sbapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    // 1. Declare dependency
    // Required dependency
    private final AnnotationBean bean;

    // Optional dependency
    private AnnotationBean bean2;

    // 2. Inject dependency (constructor-based)
    public TestController(AnnotationBean bean) {
        this.bean = bean;
    }

    @Autowired
    public void setBean2(AnnotationBean bean2) {
        this.bean2 = bean2;
    }

    @GetMapping("/bean")
    public AnnotationBean getBean() {
        System.out.println("Bean: " + bean.hashCode());
        bean.name = "My Bean";
        return bean;
    }

    @GetMapping("/bean2")
    public AnnotationBean getBean2() {
        System.out.println("Bean: " + bean2.hashCode());
        bean2.name = "My Bean 2";
        return bean2;
    }

}
