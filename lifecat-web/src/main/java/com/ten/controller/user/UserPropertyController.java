package com.ten.controller.user;

import com.ten.controller.BaseController;
import com.ten.dto.ResponseResult;
import com.ten.manager.user.UserServiceManager;
import com.ten.service.service.user.UserPropertyService;
import com.ten.vo.UserPropertyVO;
import com.ten.vo.UserPropertyVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.ten.utils.ControllerCheckUtil.*;

/**
 * user property
 *
 * @author Administrator
 */
@RestController
@RequestMapping("/user/property")
public class UserPropertyController extends BaseController<UserPropertyVO, ResponseResult> {

    @Autowired
    private UserServiceManager userServiceManager;

    /**
     * all
     * <p>
     * 展示所有用户资料信息
     *
     * @return list UserPropertyVO
     */
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    @Override
    public ResponseResult all() {
        List<UserPropertyVO> userPropertyVOList = userServiceManager.getAllUserProperty();
        checkResourceNotNull(userPropertyVOList);
        return new ResponseResult(userPropertyVOList);
    }

    /**
     * listById
     */
    @Override
    public ResponseResult list(UserPropertyVO entity) {
        return null;
    }


    /**
     * get
     * <p>
     * 根据用户账号获取用户资料信息
     *
     * @param entity UserPropertyVO
     * @return UserPropertyVO
     */
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @Override
    public ResponseResult get(@RequestBody UserPropertyVO entity) {
        // check
        checkRequestDataNotNull(entity);
        // execute
        UserPropertyVO recordVO = userServiceManager.getUserPropertyByEntity(entity);
        // return
        checkResourceNotNull(recordVO);
        return new ResponseResult(recordVO);
    }

    /**
     * getById
     * <p>
     * 根据用户账号id获取用户资料信息
     *
     * @param userId user_id
     * @return userPropertyVO
     */
    @RequestMapping(value = "/get/{userId}", method = RequestMethod.GET)
    @Override
    public ResponseResult getById(@PathVariable String userId) {
        // check
        checkRequestDataNotNull(userId);
        checkRequestDataFormatInt(userId);
        // execute
        int id = Integer.parseInt(userId);
        UserPropertyVO userPropertyVO = userServiceManager.getUserPropertyByUserId(id);
        // return
        checkResourceNotNull(userPropertyVO);
        return new ResponseResult(userPropertyVO);
    }

    /**
     * create
     * <p>
     * 上传用户资料信息
     *
     * @param entity UserPropertyVO
     * @return new UserPropertyVO
     */
    @RequestMapping(method = RequestMethod.POST)
    @Override
    public ResponseResult post(@RequestBody UserPropertyVO entity) {
        // check
        checkRequestDataNotNull(entity);
        // execute
        UserPropertyVO newUserPropertyVO = userServiceManager.createUserProperty(entity);
        // return
        checkResourceNotNull(newUserPropertyVO);
        return new ResponseResult(newUserPropertyVO);
    }

    /**
     * update
     * <p>
     * 更新用户资料信息
     *
     * @param entity UserPropertyVO
     * @return new UserPropertyVO
     */
    @RequestMapping(method = RequestMethod.PUT)
    @Override
    public ResponseResult put(@RequestBody UserPropertyVO entity) {
        // check
        checkRequestDataNotNull(entity);
        // execute
        UserPropertyVO newUserPropertyVO = userServiceManager.updateUserProperty(entity);
        // return
        checkResourceNotNull(newUserPropertyVO);
        return new ResponseResult(newUserPropertyVO);
    }

    /**
     * deleteById
     * <p>
     * 删除用户资料信息
     *
     * @param userId user_Id
     * @return result
     */
    @RequestMapping(value = "/{userId}", method = RequestMethod.DELETE)
    @Override
    public ResponseResult deleteById(@PathVariable String userId) {
        // check
        checkRequestDataNotNull(userId);
        checkRequestDataFormatInt(userId);
        // execute
        int id = Integer.parseInt(userId);
        int result = userServiceManager.deleteUserPropertyByPrimaryKey(id);
        // return
        checkExecuteResultSuccess(result);
        return new ResponseResult();
    }

    @Override
    public ResponseResult delete(UserPropertyVO entity) {
        return null;
    }
}
