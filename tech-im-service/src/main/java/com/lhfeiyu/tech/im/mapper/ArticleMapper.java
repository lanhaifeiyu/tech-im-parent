package com.lhfeiyu.tech.im.mapper;

import com.lhfeiyu.tech.im.model.Article;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * ArticleMapper
 *
 * @author lhfeiyu
 * @created Create Time: Wed Jul 03 18:30:21 CST 2019
 */
@Mapper
@Component
public interface ArticleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tech_article
     *
     * @mbg.generated Wed Jul 03 18:30:21 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tech_article
     *
     * @mbg.generated Wed Jul 03 18:30:21 CST 2019
     */
    int insert(Article record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tech_article
     *
     * @mbg.generated Wed Jul 03 18:30:21 CST 2019
     */
    int insertSelective(Article record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tech_article
     *
     * @mbg.generated Wed Jul 03 18:30:21 CST 2019
     */
    Article selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tech_article
     *
     * @mbg.generated Wed Jul 03 18:30:21 CST 2019
     */
    int updateByPrimaryKeySelective(Article record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tech_article
     *
     * @mbg.generated Wed Jul 03 18:30:21 CST 2019
     */
    int updateByPrimaryKeyWithBLOBs(Article record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tech_article
     *
     * @mbg.generated Wed Jul 03 18:30:21 CST 2019
     */
    int updateByPrimaryKey(Article record);
}