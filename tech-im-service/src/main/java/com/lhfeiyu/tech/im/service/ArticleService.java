package com.lhfeiyu.tech.im.service;

import com.lhfeiyu.tech.im.mapper.ArticleMapper;
import com.lhfeiyu.tech.im.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Airson Yu
 */
@Service
public class ArticleService {

    @Autowired
    private ArticleMapper articleMapper;

    public Article load(long id) {
        return articleMapper.selectByPrimaryKey(id);
    }

    public void add(Article article) {
        articleMapper.insertSelective(article);
    }

    public void update(Article article) {
        articleMapper.updateByPrimaryKeySelective(article);
    }

}
