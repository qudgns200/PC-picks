package io.github.qudgns200.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.qudgns200.dao.UserDao;
import io.github.qudgns200.model.User;

@Service
public class UserService {
	@Autowired
	private UserDao uDao;
	
	public User getUesrInfo(String email) {
		return uDao.selectOneUser(email);
	}
}
