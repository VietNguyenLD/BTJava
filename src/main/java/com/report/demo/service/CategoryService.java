
package com.report.demo.service;

import com.report.demo.entity.Category;
import com.report.demo.entity.User;
import com.report.demo.respository.CategoryResponsitory;
import com.report.demo.respository.UserResponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryResponsitory responsitory;
    private ServiceResult result = new ServiceResult();

    public ServiceResult saveCategory(Category category) {
        this.result.setData(responsitory.save(category));
        return result;
    }

    public ServiceResult saveCategorys(List<Category> categories) {
        this.result.setData(responsitory.saveAll(categories));
        return result;
    }



    public ServiceResult getCategorys() {
        this.result.setData(responsitory.findAll());
        return result;
    }

    public ServiceResult getCategoryById(int id) {
        this.result.setData(responsitory.findById(id).orElse(null));
        return result;
    }


    public ServiceResult deleteCategory(int id) {
        responsitory.deleteById(id);
        this.result.setData(null);
        this.result.setMessage("Deleted success !");
        return result;
    }

    public ServiceResult updateCategory(Category category) {
        Category existingCategory = responsitory.findById(category.getId()).orElse(null);
        existingCategory.setCate_title(category.getCate_title());
        existingCategory.setCate_desc(category.getCate_desc());
        existingCategory.setUpdate_at(category.getUpdate_at());
        this.result.setData(responsitory.save(existingCategory));
        return result;
    }
}
