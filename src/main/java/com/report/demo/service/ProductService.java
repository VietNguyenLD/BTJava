//package com.report.demo.service;
//
//import com.report.demo.entity.Product;
//import com.report.demo.respository.ProductResponsitory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class ProductService {
//
//    @Autowired
//    private ProductResponsitory responsitory;
//
//    public Product saveProduct(Product product){
//        return responsitory.save(product);
//    }
//
//    public List<Product> saveProducts(List<Product> products){
//        return responsitory.saveAll(products);
//    }
//
//    public List<Product> getProducts(){
//        return responsitory.findAll();
//    }
//
//    public Product getProductById(int id){
//        return responsitory.findById(id).orElse(null);
//    }
//
//    public Product getProductByName(String name){
//        return responsitory.findByName(name);
//    }
//
//    public String deleteProduct(int id){
//        responsitory.deleteById(id);
//        return "Product removed!";
//    }
//
//    public Product updateProduct(Product product){
//        Product existingProduct=responsitory.findById(product.getId()).orElse(null);
//        existingProduct.setName(product.getName());
//        existingProduct.setQuantity(product.getQuantity());
//        existingProduct.setPrice(product.getPrice());
//        return responsitory.save(existingProduct);
//    }
//}
