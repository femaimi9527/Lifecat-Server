package com.ten.serviceimpl;

import com.ten.service.UserService;
import com.ten.utils.DateTimeUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.ten.utils.ServiceCheckUtil.checkObjectDataNotNull;


@Service("userService")
public class UserServiceImpl implements UserService {

    private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    private final UserMapper userMapper;
    private final UserPropertyMapper userPropertyMapper;
    private final UserIconMapper userIconMapper;

    private DateTimeUtil dateTimeUtil = DateTimeUtil.getInstance();

    @Autowired
    public UserServiceImpl(UserMapper userMapper, UserPropertyMapper userPropertyMapper, UserIconMapper userIconMapper) {
        this.userMapper = userMapper;
        this.userPropertyMapper = userPropertyMapper;
        this.userIconMapper = userIconMapper;
    }

    /**
     * 获取所有user信息
     */
    @Override
    public List<UserDO> readUserList() {
        return userMapper.selectUserList();
    }

    /**
     * 获取user信息
     *
     * @param userName user_name
     */
    @Override
    public UserDO readUserByName(String userName) {
        Map<String, String> map = new HashMap<>(2);
        map.put("userName", userName);
        return userMapper.selectUserByName(map);
    }

    /**
     * 创建user信息
     *
     * @param userDO DO
     */
    @Override
    public int createUser(UserDO userDO) {
        // check properties
        checkObjectDataNotNull(userDO.getUserName());
        checkObjectDataNotNull(userDO.getUserPassword());
        // set properties
        String create, modified;
        create = modified = dateTimeUtil.getCurrentTime();
        userDO.setUserGmtCreate(create);
        userDO.setUserGmtModified(modified);
        userDO.setUserLevel("user");
        return userMapper.insertUser(userDO);
    }

    /**
     * 更新user信息
     *
     * @param userDO DO
     */
    @Override
    public int updateUser(UserDO userDO) {
        // check properties
        checkObjectDataNotNull(userDO.getUserId());
        checkObjectDataNotNull(userDO.getUserName());
        checkObjectDataNotNull(userDO.getUserPassword());
        checkObjectDataNotNull(userDO.getUserLevel());
        // set properties
        String modified = dateTimeUtil.getCurrentTime();
        userDO.setUserGmtModified(modified);
        return userMapper.updateUser(userDO);
    }

    /**
     * 删除user信息
     *
     * @param userId user_id
     */
    @Override
    public int deleteUserById(int userId) {
        return userMapper.deleteUserById(userId);
    }
}