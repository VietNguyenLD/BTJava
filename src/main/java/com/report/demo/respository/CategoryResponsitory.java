package com.report.demo.respository;

import com.report.demo.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CategoryResponsitory extends JpaRepository<Category, Integer>{
//    User findByUsername(String user_name);
}