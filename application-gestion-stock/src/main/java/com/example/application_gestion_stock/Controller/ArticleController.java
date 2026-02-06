package com.example.application_gestion_stock.Controller;

import com.example.application_gestion_stock.Service.ArticleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/stock")
public class ArticleController {
    private final ArticleService articleService;

    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }


    @GetMapping("/home")
    public String stock(){
        return "stock.html";
    }

    @PostMapping("/stock/appro")
    public void appro(){
        articleService.gerer();
    }
}
