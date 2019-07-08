package com.lhfeiyu.tech.im.controller.article;


import com.lhfeiyu.tech.im.api.UserApi;
import com.lhfeiyu.tech.im.dto.BaseQueryParam;
import com.lhfeiyu.tech.im.dto.BaseResult;
import com.lhfeiyu.tech.im.service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController implements UserApi {

    @Autowired
    private UserService userService;

    @Override
    public BaseResult list(BaseQueryParam param) {
        return null;
    }

    @Override
    public BaseResult add(User user) {
        //userService.add(user);
        return null;
    }

    @Override
    public BaseResult update(User user) {
        return null;
    }

}
