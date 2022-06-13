package com.codegym.jdbcstoreprocedure.dao;

import java.sql.SQLException;

import com.codegym.jdbcstoreprocedure.model.User;

public interface IUserDAO {
	public User getUserById(int id);

	public void insertUserStore(User user) throws SQLException;
}
