package com.example.infinitypobnd.repository;

import com.example.infinitypobnd.Entity.Article;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class ArticleRepositoryTest {

    @Autowired
    private ArticleRepository articleRepository;

    @Test
    public void saveTest() {
        Article article = Article.builder()
                .id(1L)
                .author("이지우")
                .mainTitle("게시글 제목1")
                .subTitle("게시글 서브제목1")
                .content("게시글 본문1")
                .build();

        Article savedArticle = articleRepository.save(article);

        System.out.println("Result ::: " + savedArticle.toString());

        Assertions.assertEquals(1L, savedArticle.getId());
        Assertions.assertEquals("이지우", savedArticle.getAuthor());

    }

}
