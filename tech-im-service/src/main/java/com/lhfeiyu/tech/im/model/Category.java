package com.lhfeiyu.tech.im.model;

/**
 * @author Airson Yu
 */
@lombok.Data
public class Category extends BaseModel {
    /**
     * 系统编号
     */
    private Long id;

    /**
     * 父节点系统编号
     */
    private Long parentId;

    /**
     * 分类名称
     */
    private String categoryName;

    /**
     * 排序优先级
     */
    private Short priority;

}