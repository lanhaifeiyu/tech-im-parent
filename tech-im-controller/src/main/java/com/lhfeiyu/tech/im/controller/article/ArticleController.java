package com.lhfeiyu.tech.im.controller.article;


import com.lhfeiyu.tech.im.api.article.ArticleApi;
import com.lhfeiyu.tech.im.dto.ArticleDTO;
import com.lhfeiyu.tech.im.dto.ResponseDTO;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticleController implements ArticleApi {

    @Override
    public ResponseDTO list(ArticleDTO requestDTO) throws Exception {
        ResponseDTO resp = new ResponseDTO();
        resp.setId(1);
        return resp;
    }
}
