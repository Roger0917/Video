package com.imooc.service;

import java.util.List;

import com.imooc.pojo.Bgm;
import com.imooc.pojo.Users;


public interface BgmService {

	/**
	 * 查询背景音乐列表
	 * @param username
	 * @return
	 */
	public List<Bgm> queryBgmList();
	
	
}
