package com.lhfeiyu.tech.im.mapper;

import com.lhfeiyu.tech.im.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * UserMapper
 *
 * @author lhfeiyu
 * @created Create Time: Wed Jul 03 18:30:21 CST 2019
 */
@Mapper
@Component
public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tech_user
     *
     * @mbg.generated Wed Jul 03 18:30:21 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tech_user
     *
     * @mbg.generated Wed Jul 03 18:30:21 CST 2019
     */
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tech_user
     *
     * @mbg.generated Wed Jul 03 18:30:21 CST 2019
     */
    int insertSelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tech_user
     *
     * @mbg.generated Wed Jul 03 18:30:21 CST 2019
     */
    User selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tech_user
     *
     * @mbg.generated Wed Jul 03 18:30:21 CST 2019
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tech_user
     *
     * @mbg.generated Wed Jul 03 18:30:21 CST 2019
     */
    int updateByPrimaryKey(User record);
}