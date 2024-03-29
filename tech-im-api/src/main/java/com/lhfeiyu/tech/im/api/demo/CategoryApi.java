package com.lhfeiyu.tech.im.api.demo;

import com.alibaba.fastjson.JSONObject;
import com.lhfeiyu.tech.im.dto.CategoryDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/category")
@Api(value = "分类相关接口", description = "提供分类相关Rest API", tags = "分类相关接口")
public interface CategoryApi {

    @ApiOperation(value = "获取分类列表", tags = "分类相关接口")
    @RequestMapping(value = "/list")
        //ResponseDTO list(@RequestBody(required = false) CategoryDTO requestDTO) throws Exception;
    JSONObject list(@RequestBody(required = false) CategoryDTO requestDTO) throws Exception;


}
