package com.userservice.repo;

import com.userservice.userentity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository <User, Integer>{
}
