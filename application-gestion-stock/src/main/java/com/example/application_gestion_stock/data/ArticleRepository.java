package com.example.application_gestion_stock.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ArticleRepository extends CrudRepository<Article, Long> {
    Optional<Article> findByLabel(String label);
}
