package com.report.demo.respository;

import com.report.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserResponsitory extends JpaRepository<User, Integer>{
//    User findByUsername(String user_name);
}