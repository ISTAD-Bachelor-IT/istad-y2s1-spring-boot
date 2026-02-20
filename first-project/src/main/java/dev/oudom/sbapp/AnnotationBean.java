package dev.oudom.sbapp;

import lombok.Getter;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Getter
public class AnnotationBean {
    String name;
}
