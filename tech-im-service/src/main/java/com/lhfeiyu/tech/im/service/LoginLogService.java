package com.lhfeiyu.tech.im.service;

import com.lhfeiyu.tech.im.mapper.LoginLogMapper;
import com.lhfeiyu.tech.im.model.LoginLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Airson Yu
 */
@Service
public class LoginLogService {

    @Autowired
    private LoginLogMapper loginLogMapper;

    public LoginLog load(long id) {
        return loginLogMapper.selectByPrimaryKey(id);
    }

    public void add(LoginLog loginLog) {
        loginLogMapper.insertSelective(loginLog);
    }

    public void update(LoginLog loginLog) {
        loginLogMapper.updateByPrimaryKeySelective(loginLog);
    }

}
