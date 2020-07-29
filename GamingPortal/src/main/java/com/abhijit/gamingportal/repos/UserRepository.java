package com.abhijit.gamingportal.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.abhijit.gamingportal.entities.User;

public interface UserRepository extends CrudRepository<User, Long> {

	User findByEmail(String email);
	
	@Modifying
	@Query("update User u set u.balance=u.balance+:balance")
	public boolean updatebalance(@Param("balance") double balance);
	}
