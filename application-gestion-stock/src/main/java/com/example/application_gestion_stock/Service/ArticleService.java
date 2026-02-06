package com.example.application_gestion_stock.Service;

import com.example.application_gestion_stock.data.ArticleRepository;
import org.springframework.stereotype.Service;

@Service
public class ArticleService {
    private final ArticleRepository articleRepository;

    public ArticleService(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    public void gerer(){
        System.out.println("Gerer");
    }
}
