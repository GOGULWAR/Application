package com.mindtree.config;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MyRepo extends JpaRepository<User,Integer >{
	
	User findByUserName(String userName);

}
