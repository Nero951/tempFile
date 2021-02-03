package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.model.Article;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component//可有可无
public interface ArticleMapper {

    int updateById(Article article);

    int deleteByUsername(String username);

    List<Article> selectAll();
}
