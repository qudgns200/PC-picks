package io.github.qudgns200.dao;

import io.github.qudgns200.model.User;

public interface UserDao {
	public User selectOneUser(String EMAIL);
}
