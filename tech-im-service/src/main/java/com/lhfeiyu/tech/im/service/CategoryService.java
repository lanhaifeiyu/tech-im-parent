package com.lhfeiyu.tech.im.service;

import com.lhfeiyu.tech.im.mapper.CategoryMapper;
import com.lhfeiyu.tech.im.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Airson Yu
 */
@Service
public class CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    public Category load(long id) {
        return categoryMapper.selectByPrimaryKey(1l);
    }

}
