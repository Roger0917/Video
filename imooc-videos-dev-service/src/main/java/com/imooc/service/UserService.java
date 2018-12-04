package com.imooc.service;

import com.imooc.pojo.Users;

public interface UserService {

	/**
	 * 判断用户名是否存在
	 * @param username
	 * @return
	 */
	public Boolean queryUsernameIsExist(String username);
	
	/**
	 *   保存用户(用户注册)
	 * @param user
	 */
	public void saveUser(Users user);
	
	/**
	 * @Description: 用户登录，根据用户名和密码查询用户
	 */
	public Users queryUserForLogin(String username, String password);
	
	/**
	 * 用户修改信息
	 * @param user
	 */
	public void updateUserInfo(Users user);
	
	/**
	 * 查询用户信息
	 * @param userId
	 * @return
	 */
	public Users queryUserInfo(String userId);
}
