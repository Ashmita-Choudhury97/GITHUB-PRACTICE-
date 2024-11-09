package com.Ecommerce.Ecommerce1.repository;

import com.Ecommerce.Ecommerce1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
