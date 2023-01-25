package com.test.daooo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jpa.test.dao.User;

public interface UserRepository extends CrudRepository<User,Integer> {

	org.springframework.boot.autoconfigure.security.SecurityProperties.User save(
			org.springframework.boot.autoconfigure.security.SecurityProperties.User user);

	Iterable<org.springframework.boot.autoconfigure.security.SecurityProperties.User> saveAll(
			List<org.springframework.boot.autoconfigure.security.SecurityProperties.User> users);

}
