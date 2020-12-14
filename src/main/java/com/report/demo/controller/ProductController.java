//package com.report.demo.controller;
//
//import com.report.demo.entity.Product;
//import com.report.demo.service.ProductService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//public class ProductController {
//
//    @Autowired
//    private ProductService service;
//
//    @PostMapping("/addProduct")
//    public Product addProduct(@RequestBody Product product){
//        return service.saveProduct(product);
//    }
//
//    @PostMapping("/addProducts")
//    public List<Product> addProducts(@RequestBody List<Product> products){
//        return service.saveProducts(products);
//
//    }
//    @GetMapping("/test")
//    public String test(){
//        return "Viet";
//    }
//
//    @GetMapping("api/v1/products")
//    public List<Product> findAllProducts(){
//        return service.getProducts();
//    }
//
//    @GetMapping("/product/{id}")
//    public Product findProductById(@PathVariable int id){
//        return service.getProductById(id);
//    }
//
//    @GetMapping("/product/{name}")
//    public Product findProductByName(@RequestParam(value = "name") String name){
//        return service.getProductByName(name);
//    }
//
//    @PutMapping("/update")
//    public Product updateProduct(@RequestBody Product product){
//        return service.updateProduct(product);
//    }
//
//
//    @GetMapping("/delete/{id}")
//    public String deleteProduct(@PathVariable int id){
//        return service.deleteProduct(id);
//    }
//}
