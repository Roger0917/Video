package com.imooc.service;

import org.n3r.idworker.Sid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.imooc.mapper.UsersMapper;
import com.imooc.pojo.Users;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UsersMapper usermapper;
	@Autowired
	private Sid sid;
	
	@Transactional(propagation=Propagation.SUPPORTS)
	@Override
	public Boolean queryUsernameIsExist(String username) {
		Users users = new Users();
		users.setUsername(username);
		
		Users result = usermapper.selectOne(users);
		return result == null? false:true;
	}

	@Transactional(propagation=Propagation.REQUIRED)
	@Override
	public void saveUser(Users user) {
		String userId = sid.nextShort();
		user.setId(userId);
		usermapper.insert(user);
	}

}
