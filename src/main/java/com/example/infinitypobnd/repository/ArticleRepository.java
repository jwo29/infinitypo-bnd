package com.example.infinitypobnd.repository;

import com.example.infinitypobnd.Entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface ArticleRepository extends JpaRepository<Article, UUID> {

    @Override
    Optional<Article> findById(UUID id);

    @Override
    List<Article> findAll();

//    @Override
//    Optional<Article> save(Article article);

}
