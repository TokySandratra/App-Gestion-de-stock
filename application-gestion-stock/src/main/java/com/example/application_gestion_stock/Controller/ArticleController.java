package com.example.application_gestion_stock.Controller;

import com.example.application_gestion_stock.Service.ArticleService;
import com.example.application_gestion_stock.data.Article;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
@RequestMapping("/stock")
public class ArticleController {
    private final ArticleService articleService;

    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }


    @GetMapping("/home")
    public ModelAndView stock(){
        ModelAndView mv = new ModelAndView("stock");
        Iterable<Article> articles = articleService.findAll();
        mv.addObject("articles",articles);
        return mv;
    }

    @PostMapping("/appro")
    public RedirectView appro(){
        articleService.appro();
        return new RedirectView("/stock/home");
    }
}
