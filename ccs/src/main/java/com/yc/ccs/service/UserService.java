package com.yc.ccs.service;

import com.yc.ccs.entity.User;

public interface UserService {

	void resetPassword(String username, String randPassword);

	User login(User user);

}
