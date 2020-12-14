package com.report.demo.controller;

import com.report.demo.entity.Category;
import com.report.demo.service.ServiceResult;
import com.report.demo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class CategoryController {

    @Autowired
    private CategoryService service;

    /* CREATE category */
    @PostMapping("/category")
    public ResponseEntity<ServiceResult> addCategory(@RequestBody Category category) {
        return new ResponseEntity<ServiceResult>(service.saveCategory(category), HttpStatus.OK);
    }

    /* CREATE LIST category */
    @PostMapping("/categorys")
    public ResponseEntity<ServiceResult> addCategorys(@RequestBody List<Category> categorys) {
        return new ResponseEntity<ServiceResult>(service.saveCategorys(categorys), HttpStatus.OK);
    }

    /* GET LIST category */
    @GetMapping("/categorys")
    public ResponseEntity<ServiceResult> findAllCategorys() {
        return new ResponseEntity<ServiceResult>(service.getCategorys(),HttpStatus.OK);
    }

    /* GET category BY ID */
    @GetMapping("/category/{id}")
    public ResponseEntity<ServiceResult> findCategoryById(@PathVariable int id) {
        return new ResponseEntity<ServiceResult>(service.getCategoryById(id), HttpStatus.OK);
    }


    /* UPDATE category */
    @PutMapping("/category")
    public ResponseEntity<ServiceResult> updateCategory(@RequestBody Category category) {
        return new ResponseEntity<ServiceResult>(service.updateCategory(category), HttpStatus.OK);
    }

    /* DELETE BY ID */
    @GetMapping("category/delete/{id}")
    public ResponseEntity<ServiceResult> deleteCategory(@PathVariable int id) {
        return new ResponseEntity<ServiceResult>(service.deleteCategory(id), HttpStatus.OK);
    }


}
