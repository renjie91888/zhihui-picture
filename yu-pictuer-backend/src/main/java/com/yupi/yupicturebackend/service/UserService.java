package com.yupi.yupicturebackend.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yupi.yupicturebackend.model.dto.user.UserQueryRequest;
import com.yupi.yupicturebackend.model.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yupi.yupicturebackend.model.vo.LoginUserVO;
import com.yupi.yupicturebackend.model.vo.UserVO;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
* @author Administrator
* @description 针对表【user(用户)】的数据库操作Service
* @createDate 2025-01-02 21:24:01
*/
public interface UserService extends IService<User> {
    /**
     * 用户注册
     *
     * @param userAccount 用户账户
     * @param userPassword 用户密码
     * @param checkPassword 确认密码
     * @return 新用户 ID
     */

    long userRegister(String userAccount, String userPassword, String checkPassword);

    /**
     * 用户登录
     *
     * @param userAccount  用户账户
     * @param userPassword 用户密码
     * @param request
     * @return 脱敏后的用户信息
     */
    LoginUserVO userLogin(String userAccount, String userPassword, HttpServletRequest request);


    /**
     * 获取加密后的密码
     */
    String getEncryptPassword(String userPassword);

    /**
     * 获取当前的用户登录
     * @param request
     * @return
     */
    User getLoginUser(HttpServletRequest request);

    /**
     * 获取脱敏后的登录用户信息
     * @param user
     * @return
     */
    LoginUserVO getLoginUserVO(User user);


    /**
     * 获取脱敏后的用户信息
     * @param user
     * @return
     */
    UserVO getUserVO(User user);

    /**
     * 获取脱敏后的用户信息列表
     * @param userList
     * @return 脱敏后的用户信息列表
     */
    List<UserVO> getUserVOList(List<User> userList );

    /**
     * 用户注销
     * @param request
     * @return
      */
    boolean userLogout(HttpServletRequest request);

    /**
     * 获取查询条件的 QueryWrapper
     * @param userQueryRequest
     * @return
     */
    QueryWrapper<User> getQueryWrapper(UserQueryRequest userQueryRequest);
}
