
package com.report.demo.service;

import com.report.demo.entity.Product;
import com.report.demo.entity.User;
import com.report.demo.respository.UserResponsitory;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserResponsitory responsitory;
    private ServiceResult result = new ServiceResult();
//    private BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

    public ServiceResult saveUser(User user) {
//        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        this.result.setData(responsitory.save(user));
        return result;
    }

    public ServiceResult saveUsers(List<User> users) {
        this.result.setData(responsitory.saveAll(users));
        return result;
    }

//    public ServiceResult getUserByUserName(String userName){
//        this.result.setData(responsitory.findByUserName(userName));
//        return result;
//    }

    public ServiceResult getUsers() {
        this.result.setData(responsitory.findAll());
        return result;
    }

    public ServiceResult getUserById(int id) {
        this.result.setData(responsitory.findById(id).orElse(null));
        return result;
    }


    public ServiceResult deleteUser(int id) {
        responsitory.deleteById(id);
        this.result.setData(null);
        this.result.setMessage("Deleted success !");
        return result;
    }

    public ServiceResult updateUser(User user) {
        User existingUser = responsitory.findById(user.getId()).orElse(null);
        existingUser.setFirst_name(user.getFirst_name());
        existingUser.setLast_name(user.getLast_name());
        existingUser.setPassword(user.getPassword());
        existingUser.setEmail(user.getEmail());
        existingUser.setUpdate_at(user.getUpdate_at());
        existingUser.setUser_name(user.getUser_name());
        this.result.setData(responsitory.save(existingUser));
        return result;
    }
}
