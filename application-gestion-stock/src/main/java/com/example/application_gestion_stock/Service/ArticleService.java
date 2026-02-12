package com.example.application_gestion_stock.Service;

import com.example.application_gestion_stock.data.Article;
import com.example.application_gestion_stock.data.ArticleRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticleService {
    private final ArticleRepository articleRepository;

    public ArticleService(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    public void appro() {
        List<Article> arrivages = List.of(
                new Article("Bonbons", 50),
                new Article("Gateau", 10)
        );

        for (Article nouvelArticle : arrivages) {
            Optional<Article> articleExistant = articleRepository.findByLabel(nouvelArticle.getLabel());

            if (articleExistant.isPresent()) {
                // 2. S'il existe, on récupère l'ancien et on additionne les quantités
                Article aUpdate = articleExistant.get();
                aUpdate.setQuantity(aUpdate.getQuantity() + nouvelArticle.getQuantity());
                articleRepository.save(aUpdate);
            } else {
                articleRepository.save(nouvelArticle);
            }
        }
    }

    public Iterable<Article> findAll(){
        return articleRepository.findAll();
    }
}
