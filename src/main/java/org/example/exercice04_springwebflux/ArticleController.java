package org.example.exercice04_springwebflux;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/api")
@RestController
public class ArticleController {
    public static List<String> articles = new ArrayList<>();

    @GetMapping("/articles")
    public Flux<String> getArticles() {
        articles.add("Introduction to Spring WebFlux");
        articles.add("Reactive Programming with Project Reactor");
        articles.add("Building APIs with Spring Boot");

        return Flux.fromIterable(articles);
    }

}
